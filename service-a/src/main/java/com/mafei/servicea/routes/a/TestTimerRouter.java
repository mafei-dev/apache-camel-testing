package com.mafei.servicea.routes.a;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
@RequiredArgsConstructor
@Slf4j
public class TestTimerRouter extends RouteBuilder {

    private final CurrentTime currentTime;
    private final Combine combine;

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
                    .log("body after form - ${body}")
                    .transform().constant("Test constant message")
                    .log("body after transform - ${body}")
                    //.transform().constant("time is "+ LocalDateTime.now())
//                    .transform().constant(currentTime.getCurrentTime())
                    .bean(currentTime) //does the class has only one method, no need to mention the method.
                    .log("body after been called - ${body}")
                    .bean(combine)
                    .log("body combined - ${body}")

                    //process with lambda expressions
                    .process(
                            // this is same as a bean with one void method
                            exchange -> {
                                log.info("Lambda processor {} ", exchange.getMessage().getBody());
                            }
                    )
                    //process with implemented class
                    .process(new SimpleProcessor())
                    .to("log:first-timer");
        }


    }


}
