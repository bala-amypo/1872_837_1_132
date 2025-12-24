package com.example.demo.service.impl;

import com.example.demo.model.Skill;
import com.example.demo.repository.SkillRepository;
import com.example.demo.service.SkillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    private final SkillRepository repository;

    public SkillServiceImpl(SkillRepository repository) {
        this.repository = repository;
    }

    @Override
    public Skill create(Skill skill) {
        return repository.save(skill);
    }

    @Override
    public Skill get(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Skill updateSkill(Long id, Object obj) {
        Skill skill = repository.findById(id).orElse(null);
        return skill;
    }

    @Override
    public List<Skill> getAllSkills() {
        return repository.findAll();
    }
}
