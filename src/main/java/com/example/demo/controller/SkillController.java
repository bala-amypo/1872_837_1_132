package com.example.demo.controller;

import com.example.demo.model.Skill;
import com.example.demo.service.SkillService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    public List<Skill> list() {
        return skillService.getAllSkills();
    }

    public Skill update(Long id, Skill skill) {
        return skillService.update(id, skill);
    }
}
