package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/requests")
public class SkillRequestController {

    @GetMapping
    public String getRequests() {
        return "requests";
    }
}
