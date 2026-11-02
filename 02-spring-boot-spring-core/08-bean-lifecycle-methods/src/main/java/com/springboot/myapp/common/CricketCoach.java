package com.springboot.myapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("Constructor: "+this.getClass().getSimpleName());
    }

    @PostConstruct
    public void doStartup() {
        System.out.println("this is the init method (post-construct)");
    }

    @PreDestroy
    public void doCleanup(){
        System.out.println("this is the destroy method (pre-destroy)");
    }

    @Override
    public String getDailyWorkout() {
        return "Hey this is Cricket Coach Daily Workout Schedule";
    }
}
