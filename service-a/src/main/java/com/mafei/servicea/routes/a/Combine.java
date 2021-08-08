package com.mafei.servicea.routes.a;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Combine {
    public void add(String time) {
        log.info("The time is now = {}", time);
    }
}
