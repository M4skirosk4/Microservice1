/**
 * Esta es la clase principal en la que se envían las cosas
 * Se añaden comentarios extra
 */

package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/mensaje1")
    public String hello() {
        return "¡Hello Erik, I´m Microservice 1!";
    }
}
