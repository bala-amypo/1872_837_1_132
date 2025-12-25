package com.example.demo.service;

import com.example.demo.model.Skill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    public Skill create(Skill skill) {
        return skill;
    }

    public Skill get(Long id) {
        Skill s = new Skill();
        s.setId(id);
        s.setName("Java");
        return s;
    }

    public Skill update(Long id, Skill skill) {
        skill.setId(id);
        return skill;
    }

    public List<Skill> getAll() {
        return List.of(new Skill());
    }
}
