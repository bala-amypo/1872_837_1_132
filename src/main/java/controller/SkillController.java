package com.example.demo.controller;

import com.example.demo.model.Skill;
import com.example.demo.service.SkillService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/skills")
public class SkillController {

    private final SkillService service;

    public SkillController(SkillService service) {
        this.service = service;
    }

    @PostMapping
    public Skill create(@RequestBody Skill skill) {
        return service.createSkill(skill);
    }

    @GetMapping("/{id}")
    public Skill get(@PathVariable Long id) {
        return service.get(id);
    }

    @PutMapping("/{id}")
    public Skill update(@PathVariable Long id, @RequestBody Skill skill) {
        return service.updateSkill(id, skill);
    }
    @GetMapping("/list")
public List<Skill> list() {
    return service.getAllSkills();
}

}
