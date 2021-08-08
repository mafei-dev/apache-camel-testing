package com.mafei.servicea.routes.c;

import lombok.RequiredArgsConstructor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ActiveMQSender extends RouteBuilder {
    private final TimeView timeView;

    @Override
    public void configure() throws Exception {
        {
            //timer
            //queue
        }

        //Every 5 seconds a message will be sent to the activeMQ
        from("timer:message-timer?period=5000")
                .bean(timeView)
                .log("${body}")
                .to("activemq:test-activemq-queue")
                //log after sending each message
                .log("Message has been sent.");
    }


}
