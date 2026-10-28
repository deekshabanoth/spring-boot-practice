package com.springboot.myapp.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Hey this is Football Coach Daily Workout Schedule";
    }
}
