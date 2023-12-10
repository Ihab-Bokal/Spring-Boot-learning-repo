package com.IoC.and.DependencyInjection.IoCAndDI.common;

public class BasketBallCoach implements ICoach {
    @Override
    public String getDailyWorkout() {
        return "Train on your handles for the next 1 hour";
    }
}
