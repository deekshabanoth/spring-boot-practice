package com.springboot.myapp.rest;

import com.springboot.myapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public DemoController( Coach myCoach) {
        this.myCoach = myCoach;
    }

/*  Qualifier has the higher preference when both primary and qualifier are present */
//    @Autowired
//    public DemoController(@Qualifier("badmintonCoach") Coach myCoach) {
//        this.myCoach = myCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
