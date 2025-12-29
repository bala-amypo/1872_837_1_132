package com.example.demo.service;

import com.example.demo.model.Skill;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SkillService {

    private final Map<Long, Skill> store = new HashMap<>();
    private long idCounter = 1;

    // CREATE
    public Skill create(Skill skill) {
        skill.setId(idCounter++);
        store.put(skill.getId(), skill);
        return skill;
    }

    // GET BY ID
    public Skill getById(Long id) {
        return store.get(id);
    }

    // GET ALL
    public List<Skill> getAll() {
        return new ArrayList<>(store.values());
    }

    // UPDATE
    public Skill update(Long id, Skill skill) {
        skill.setId(id);
        store.put(id, skill);
        return skill;
    }

    // DELETE
    public void delete(Long id) {
        store.remove(id);
    }
}
