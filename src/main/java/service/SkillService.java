package com.example.demo.service;

import com.example.demo.model.Skill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {
    public Skill create(Skill skill) { return skill; }
    public Skill get(Long id) { return new Skill(); }
    public Skill updateSkill(Long id, Skill skill) { return skill; }
    public List<Skill> getAllSkills() { return List.of(new Skill()); }
}
