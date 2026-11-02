package com.springboot.myapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach{

    public BadmintonCoach() {
        System.out.println("Constructor: "+this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Hey this is Badminton Coach Daily Workout Schedule";
    }
}
