package com.demotest.example.demoThree.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    String index() {
        return "Spring Boot - Spring Data JPA - H2 Web Console";
    }
}