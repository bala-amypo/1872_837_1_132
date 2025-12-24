package com.example.demo.service;

import com.example.demo.model.SkillRequest;
import java.util.List;

public interface SkillRequestService {

    SkillRequest create(SkillRequest request);

    SkillRequest get(Long id);

    List<SkillRequest> getAll();

    List<SkillRequest> getByUser(Long userId);
}
