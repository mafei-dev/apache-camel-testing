package com.mafei.servicea.routes.a;

import lombok.RequiredArgsConstructor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestTimerRouter extends RouteBuilder {

    private final CurrentTime currentTime;

    @Override
    public void configure() throws Exception {

        {
            //queue [timer]
            //transformation
            //database [log]
        }


        {
            //timer
            //transformation
            //log
            from("timer:first-timer")//null
                    //.transform().constant("Test constant message")
                    //.transform().constant("time is "+ LocalDateTime.now())
//                    .transform().constant(currentTime.getCurrentTime())
                    .bean(currentTime) //does the class has only one method, no need to mention the method.
                    .to("log:first-timer");
        }


    }


}
