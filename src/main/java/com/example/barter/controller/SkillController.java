package com.example.demo.controller;

import com.example.demo.model.Skill;
import com.example.demo.service.SkillService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }
@PostMapping
public Skill createSkill(@RequestBody Skill skill) {
    return skillService.createSkill(skill);
}

@GetMapping("/{id}")
public Skill getSkillById(@PathVariable Long id) {
    return skillService.getSkillById(id);
}


    // ✅ FIX 1
    @PutMapping("/{id}")
    public Skill update(@PathVariable Long id, @RequestBody Skill skill) {
        return skillService.updateSkill(id, skill);
    }

    // ✅ FIX 2
    @GetMapping
    public List<Skill> getAllSkills() {
        return skillService.getAllSkills();
    }
}
