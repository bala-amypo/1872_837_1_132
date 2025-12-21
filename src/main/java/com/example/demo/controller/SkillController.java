package com.example.demo.controller;

import com.example.demo.model.Skill;
import com.example.demo.service.SkillService;
import org.springframework.web.bind.annotation.*;

@RestController
public class SkillController {

    private final SkillService service;

    public SkillController(SkillService service) {
        this.service = service;
    }

    @PutMapping("/skills/{id}")
    public Skill update(Long id, Skill skill) {
        return service.updateSkill(id, skill);
    }
}
