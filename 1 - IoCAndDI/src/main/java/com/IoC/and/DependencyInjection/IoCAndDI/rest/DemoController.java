package com.IoC.and.DependencyInjection.IoCAndDI.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final ICoach myCoach;

    @Autowired
    public DemoController(ICoach coach) {
        // As log as I haven't created CricketCoach and declared it as a Component, the params for the
        // constructor raise an error saying that no Bean implements the interface ICoach
        this.myCoach = coach;
    }

    @GetMapping("/")
    public String greet() {
        return "Hello there!";
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return this.myCoach.getDailyWorkout();
    }
}
