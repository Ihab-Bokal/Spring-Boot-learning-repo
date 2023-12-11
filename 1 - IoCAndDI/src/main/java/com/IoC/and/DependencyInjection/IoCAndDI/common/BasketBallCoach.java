package com.IoC.and.DependencyInjection.IoCAndDI.common;

import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements ICoach {

    public BasketBallCoach() {
        System.out.println("In constructor:" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Train on your handles for the next 1 hour";
    }
}
