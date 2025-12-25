package com.example.demo.service;

import com.example.demo.model.Skill;
import org.springframework.stereotype.Service;

@Service
public class SkillService {

    public Skill createSkill(Object obj) {
        return (Skill) obj;
    }

    public Skill updateSkill(long id, Object obj) {
        Skill s = (Skill) obj;
        s.setId(id);
        return s;
    }

    public Skill get(long id) {
        Skill s = new Skill();
        s.setId(id);
        return s;
    }
    import java.util.List;

public List<Skill> getAllSkills() {
    return List.of(new Skill());
}

}
