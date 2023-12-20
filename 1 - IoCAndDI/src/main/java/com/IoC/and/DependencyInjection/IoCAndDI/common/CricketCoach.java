package com.IoC.and.DependencyInjection.IoCAndDI.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
// Spring container will create a new instance of CricketCoach every time it's required for DI when using SCOPE_PROTOTYPE
// Check tests in /rest/ScopeTestController to know more
public class CricketCoach implements ICoach {
    public CricketCoach() {
        System.out.println("In constructor:" + getClass().getSimpleName() + " has been instantiated!");
    }

    @PostConstruct
    public void postConstructAction() {
        // @PostConstruct tells Spring to execute that method whenever it instantiates the object in question
        System.out.println("This is a routine action I perform after having been initialized");
    }

    @PreDestroy
    public void preDestroyAction() {
        // @PostConstruct tells Spring to execute that method whenever it is about to destroy the object
        System.out.println("This is a routine action I perform before I am destroyed");
    }

    @Override
    public String getDailyWorkout() {
        return "play 15mn of bowling";
    }

}
