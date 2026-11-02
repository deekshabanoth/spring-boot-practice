package com.springboot.myapp.common;

import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Hey this is Badminton Coach Daily Workout Schedule";
    }
}
