package com.springboot.myapp.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Hey this is Tennis Coach Daily Workout Schedule";
    }
}
