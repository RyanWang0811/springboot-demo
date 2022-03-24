package com.ryanwang.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value( "${app.version}" )
    private String appVersion;

    @GetMapping("/hello")
    public String hello(){
       return "Hello World";
    }

    @GetMapping("/version")
    public String version(){
        return appVersion ;
    }
}
