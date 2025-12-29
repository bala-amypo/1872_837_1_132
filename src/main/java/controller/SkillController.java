package com.example.demo.controller;

import com.example.demo.model.Skill;
import com.example.demo.service.SkillService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {

    private final SkillService service;

    public SkillController(SkillService service) {
        this.service = service;
    }

    @Operation(summary = "Create a new skill")
    @PostMapping
    public Skill create(@RequestBody Skill skill) {
        return service.create(skill);
    }

    @Operation(summary = "Get skill by ID")
    @GetMapping("/{id}")
    public Skill get(@PathVariable Long id) {
        return service.get(id);
    }

    @Operation(summary = "Get all skills")
    @GetMapping
    public List<Skill> getAll() {
        return service.getAll();
    }

    @Operation(summary = "Update skill")
    @PutMapping("/{id}")
    public Skill update(@PathVariable Long id, @RequestBody Skill skill) {
        return service.update(id, skill);
    }

    @Operation(summary = "Delete skill")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
