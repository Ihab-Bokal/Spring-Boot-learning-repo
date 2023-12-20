package com.IoC.and.DependencyInjection.IoCAndDI.rest;


import com.IoC.and.DependencyInjection.IoCAndDI.common.ICoach;
import com.IoC.and.DependencyInjection.IoCAndDI.config.CoachesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private ICoach myCoach;

    // What Spring Boot does here is that it creates a new instance of CricketCoach
    // It first checks for @Component classes that implement the ICoach interface and then instantiates them
    // And injects them in the constructor

    @Autowired
    public DemoController(@Qualifier("cricketCoach") ICoach coach) {
        /* 1. As log as I haven't created CricketCoach and declared it as a Component, the params for the
         constructor raise an error saying that no Bean implements the interface ICoach */
        this.myCoach = coach;
    }


    // Use the @Qualifier("className") so that Spring can know which Component to inject
    @Autowired
    public void setMyCoach(@Qualifier("I can set a Bean Id that way :)") ICoach myCoach) {
        // Check out CoachesConfig to know why "I can set a Bean Id that way :)" is the bean's ID
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.myCoach = CoachesConfig.swimCoach();
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
