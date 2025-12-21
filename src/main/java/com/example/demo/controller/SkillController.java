package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/skills")
public class SkillController {

    @GetMapping
    public String getSkills() {
        return "skills";
    }
}
