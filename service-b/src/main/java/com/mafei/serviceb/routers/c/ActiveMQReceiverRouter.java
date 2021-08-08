package com.mafei.serviceb.routers.c;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQReceiverRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("activemq:test-activemq-queue")
                .to("log:received-message-from-active-mq");

    }
}
