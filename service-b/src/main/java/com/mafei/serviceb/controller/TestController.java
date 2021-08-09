package com.mafei.serviceb.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    @GetMapping("/{date}")
    public ResponseEntity<String> index(@PathVariable String date) {
        return ResponseEntity.ok("hi i am from service [b] time from server [a] is " + date);
    }
}
