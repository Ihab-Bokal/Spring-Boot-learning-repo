package com.IoC.and.DependencyInjection.IoCAndDI.rest;

import com.IoC.and.DependencyInjection.IoCAndDI.common.ICoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This class has been created to see the effect of the SCOPE_PROTOTYPE enum, if it works as intended whenever I change the endpoint I should get the
// CricketCoach() constructor's message in the terminal

// post testing remarks: it works just fine and I got yhe message I wanted twice after having changed from dailyworkout endpoint to scopetest

// after changing the SCOPE to SCOPE_SINGLETON the constructor message appeared only once in the terminal

@RestController
public class ScopeTestController {
    private final ICoach coach;

    @Autowired
    public ScopeTestController(@Qualifier("cricketCoach") ICoach myCoach) {
        this.coach = myCoach;
    }


    @GetMapping("/scopetest")
    public String scopeTest() {
        return "<h1>"+ coach.getDailyWorkout() + "</h1>";
    }
}
