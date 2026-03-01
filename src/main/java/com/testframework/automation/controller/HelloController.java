package com.testframework.automation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/getResp")
    public String sayHello() {
        return "This is first Spring boot Hello from Spring Boot!";
    }
}

