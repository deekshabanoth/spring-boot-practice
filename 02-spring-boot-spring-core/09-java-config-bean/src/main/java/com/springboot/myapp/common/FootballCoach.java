package com.springboot.myapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FootballCoach implements Coach{

    public FootballCoach() {
        System.out.println("Constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Hey this is Football Coach Daily Workout Schedule";
    }
}
