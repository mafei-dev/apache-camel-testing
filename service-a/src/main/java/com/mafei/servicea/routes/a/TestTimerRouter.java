package com.mafei.servicea.routes.a;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TestTimerRouter extends RouteBuilder {


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
                    .transform().constant("time is "+ LocalDateTime.now())
                    .to("log:first-timer");
        }


    }


}
