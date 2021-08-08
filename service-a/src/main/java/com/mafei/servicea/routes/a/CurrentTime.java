package com.mafei.servicea.routes.a;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CurrentTime {
    public String getCurrentTime() {
        return "Time is "+ LocalDateTime.now();
    }
}
