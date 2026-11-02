package com.springboot.myapp.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Hey this is Cricket Coach Daily Workout Schedule";
    }
}
