package com.example.demo.service;

import com.example.demo.model.SkillRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillRequestService {

    public SkillRequest create(SkillRequest request) {
        return request;
    }

    public List<SkillRequest> getAll() {
        return List.of(new SkillRequest());
    }
}
