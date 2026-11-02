package com.springboot.myapp.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("Constructor: "+this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Hey this is Cricket Coach Daily Workout Schedule";
    }
}
