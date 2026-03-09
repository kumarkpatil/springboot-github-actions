package com.kp.hello_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class HomeController {


    @GetMapping
    public String hello(){
        return "Application UP & Running ";
    }


    @GetMapping("/hello/{name}")
    public String greet(@PathVariable String name){
        LocalTime time = LocalTime.now();
        String welcomMessage = "";
        int hour = time.getHour();

        if(hour>4 &&  hour<12)
            welcomMessage="Good Morning";
        else if(hour>12 && hour < 16)
            welcomMessage="Good Afternoon";
        else if(hour>=16 && hour <20)
            welcomMessage="Good Evening";
        else
            welcomMessage="Good Night";
        return "Hello "+name.toUpperCase()+ " "+welcomMessage;
    }

}
