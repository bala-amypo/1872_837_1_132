package com.example.demo.service;

import com.example.demo.model.Skill;
import java.util.List;

public interface SkillService {
    Skill create(Skill skill);
    Skill get(Long id);
    Skill updateSkill(Long id, Skill skill);
    List<Skill> getAllSkills();
}
