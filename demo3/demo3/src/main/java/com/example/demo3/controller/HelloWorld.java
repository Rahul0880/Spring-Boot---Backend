package com.example.demo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class HelloWorld {
    @GetMapping(path="/hello")
    public String abc()
    {
        return "Hello world";
    }

}
