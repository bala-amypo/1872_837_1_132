package com.example.demo.service.impl;

import com.example.demo.model.Skill;
import com.example.demo.service.SkillService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    @Override
    public Skill create(Skill skill) {
        return skill;
    }

    @Override
    public Skill get(Long id) {
        Skill skill = new Skill();
        skill.setId(id);
        return skill;
    }

    @Override
    public Skill update(Long id, Skill skill) {
        skill.setId(id);
        return skill;
    }

    @Override
    public List<Skill> getAll() {
        return new ArrayList<>();
    }
}
