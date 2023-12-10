package com.IoC.and.DependencyInjection.IoCAndDI.common;

import org.springframework.stereotype.Component;


@Component
public class CricketCoach implements ICoach {
    @Override
    public String getDailyWorkout() {
        return "play 15mn of bowling";
    }

}
