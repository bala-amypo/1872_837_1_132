package com.example.demo.service;

import com.example.demo.model.Skill;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;

@Service
public class SkillService {

    private final Map<Long, Skill> store = new HashMap<>();
    private long idCounter = 1;

@PostMapping
public Skill create(@RequestBody Skill skill) {
    try {
        return service.create(skill);
    } catch (Exception e) {
        e.printStackTrace(); // 👈 THIS WILL SHOW THE REAL CAUSE
        throw e;
    }
}


    public Skill getById(Long id) {
        return store.get(id);
    }

    public List<Skill> getAll() {
        return new ArrayList<>(store.values());
    }

    public Skill update(Long id, Skill skill) {
        skill.setId(id);
        store.put(id, skill);
        return skill;
    }

    public void delete(Long id) {
        store.remove(id);
    }
}
