package com.ejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/mensaje1")
    public String hello() {
        return "¡Hello from Microservice 1!";
    }
}
