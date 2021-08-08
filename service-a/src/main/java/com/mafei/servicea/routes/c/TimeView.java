package com.mafei.servicea.routes.c;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TimeView {
    public String getTime() {
        return "My time is " + LocalDateTime.now().toString();
    }

}
