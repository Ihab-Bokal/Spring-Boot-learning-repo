package com.practice_spring_boot.first_project.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IhabData {
    // testing class to see if spring-boot-devtools is working properly
    // sb-devtools is a dependency that restarts our app automatically whenever we make any change to our code
    @GetMapping("/ihab")
    public String ihab() {
        return "name: ihab Bokal<br/> age: 21 years old<br/>status: GOAT";
    }
}
