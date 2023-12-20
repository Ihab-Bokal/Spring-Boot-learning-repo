package com.IoC.and.DependencyInjection.IoCAndDI.config;

import com.IoC.and.DependencyInjection.IoCAndDI.common.SwimCoach;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoachesConfig {

    @Bean("I can set a Bean Id that way :)")
    public static SwimCoach swimCoach() {
        // We suppose here that the SwimCoach class is a third party class that cannot declare as a bean
        // I removed the @Component annotation from it so that it simulates a 3rd party lib
        return new SwimCoach();
    }
}
