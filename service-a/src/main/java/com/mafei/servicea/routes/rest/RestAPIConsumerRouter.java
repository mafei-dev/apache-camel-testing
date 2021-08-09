package com.mafei.servicea.routes.rest;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class RestAPIConsumerRouter extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        restConfiguration().host("localhost").port(8081);
        from("timer:rest-consumer?period=5000")
                .setHeader("date", () -> LocalDateTime.now().toString())
                .log("${body}")
                .to("rest:get:/test/{date}")
                .log("${body}");

    }
}
