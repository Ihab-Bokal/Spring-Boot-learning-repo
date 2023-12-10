package com.IoC.and.DependencyInjection.IoCAndDI.common;

public class TenisCoach implements ICoach{
    @Override
    public String getDailyWorkout() {
        return "Do some tenis training!";
    }
}
