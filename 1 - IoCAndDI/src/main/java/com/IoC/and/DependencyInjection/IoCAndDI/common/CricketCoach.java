package com.IoC.and.DependencyInjection.IoCAndDI.common;

import org.springframework.stereotype.Component;


@Component
public class CricketCoach implements ICoach {
    public CricketCoach() {
        System.out.println("In constructor:" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "play 15mn of bowling";
    }

}
