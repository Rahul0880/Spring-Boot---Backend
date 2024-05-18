package com.example.demo3.controller;

import com.example.demo3.entities.HelloWorldbeanentity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworldbeancontroller {
    @GetMapping(path="/bean")
    public HelloWorldbeanentity helloworldbean()
    {
        return new HelloWorldbeanentity("Hello");
    }
}
