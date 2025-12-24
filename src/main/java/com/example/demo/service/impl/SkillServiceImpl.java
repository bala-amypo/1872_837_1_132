package com.example.demo.service.impl;

import com.example.demo.model.Skill;
import com.example.demo.service.SkillService;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class SkillServiceImpl implements SkillService {

    @Override
    public List<Skill> getAllSkills() {
        return new ArrayList<>();
    }

    @Override
        public Skill updateSkill(Long id, Object skill) {
            return new Skill();
    }

    @Override
        public Skill update(Long id, Skill skill) {
            return skill;   
    }
}
