package com.chaddarby.spring.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
@RequestMapping("/")
public class HelloController {

    // injecting properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;



    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello world!";
    }

    @GetMapping("/time")
    public String time() {
        return "Date & time on server is " + LocalDateTime.now();
    }

    // expose new endpoint to use properties
    @GetMapping("/team-info")
    public String getTeamInfo() {
        return "COACH: " + coachName + ", TEAM: " + teamName;
    }
}
