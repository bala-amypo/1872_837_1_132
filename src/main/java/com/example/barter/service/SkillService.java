package com.example.barter.service;

import com.example.barter.model.Skill;
import java.util.List;

package com.example.barter.service;

import com.example.barter.model.Skill;
import java.util.List;

public interface SkillService {

    Skill getById(Long id);

    List<Skill> getAll();
}
