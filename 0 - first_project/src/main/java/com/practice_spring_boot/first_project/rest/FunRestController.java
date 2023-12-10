package com.practice_spring_boot.first_project.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Expose "/" that'll return Hello World
    @GetMapping("/")
    public String greet() {
        return "Hello world!";
    }

}
