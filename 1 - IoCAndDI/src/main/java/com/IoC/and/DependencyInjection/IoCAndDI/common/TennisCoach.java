package com.IoC.and.DependencyInjection.IoCAndDI.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements ICoach {
    // The lazy annotation tells the class not to be initialized when the app starts but rather when it's needed for DI
    public TennisCoach() {
        System.out.println("In constructor:" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Do some tennis training!";
    }
}
