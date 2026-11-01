package com.chandu.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/greet")
    public String home() {
        return "Hello Chandu! Welcome to Spring Boot with Gradle.";
    }
}