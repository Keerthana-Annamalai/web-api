package com.pipercadd.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World! User";
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to the homepage! User";
    }
}
