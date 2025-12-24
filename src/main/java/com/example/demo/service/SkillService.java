package com.example.demo.service;

import com.example.demo.model.Skill;
import java.util.List;

public interface SkillService {

    List<Skill> getAllSkills();

    Skill updateSkill(Long id, Object skill);

    Skill update(Long id, Skill skill);
}
