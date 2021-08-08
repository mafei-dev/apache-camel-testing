package com.mafei.servicea.routes.a;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;


@Slf4j
public class SimpleProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        log.info("SimpleProcessor {} ", exchange.getMessage().getBody());
    }
}
