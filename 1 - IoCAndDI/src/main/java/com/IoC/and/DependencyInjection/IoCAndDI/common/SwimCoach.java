package com.IoC.and.DependencyInjection.IoCAndDI.common;


import org.springframework.stereotype.Component;


public class SwimCoach implements ICoach {
    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "swim a 1,000 miles";
    }
}
