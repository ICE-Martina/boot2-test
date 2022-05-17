package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloController() {
        return "Hello !!";
    }

    @GetMapping("/user/{name}")
    public String user(@PathVariable("name") String name) {
        return "hello, " + name;
    }
}
