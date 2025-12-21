package com.example.demo.serviceimpl;

import com.example.demo.model.Skill;
import com.example.demo.service.SkillService;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl implements SkillService {
    @Override
    public Skill updateSkill(Long id, Object skill) {
        return (Skill) skill;
    }
}
