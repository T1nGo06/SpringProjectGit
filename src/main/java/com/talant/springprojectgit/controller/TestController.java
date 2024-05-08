package com.talant.springprojectgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class TestController {
    @GetMapping(value = "/test-1")
    public String sayHello(){
        return "Hello World!";
    }
}
