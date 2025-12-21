package com.example.demo.controller;

import com.example.demo.service.SkillService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/skills")
public class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping
    public String getSkills() {
        return skillService.getAllSkills();
    }
}
