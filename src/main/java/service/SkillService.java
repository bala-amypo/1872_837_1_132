package com.example.demo.service;

import com.example.demo.model.Skill;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SkillService {

    private final Map<Long, Skill> store = new HashMap<>();
    private long idCounter = 1;

    public Skill create(Skill skill) {
        skill.setId(idCounter++);
        store.put(skill.getId(), skill);
        return skill;
    }

    public Skill get(Long id) {
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
