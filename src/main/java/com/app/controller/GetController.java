package com.app.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GetController {
    @GetMapping(value = "/api1", produces = MediaType.TEXT_PLAIN_VALUE)
    public String helloWorld() {
        return "Hello World";
    }

}
