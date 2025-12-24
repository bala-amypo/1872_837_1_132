package com.example.demo.service.impl;

import com.example.demo.model.SkillRequest;
import com.example.demo.repository.SkillRequestRepository;
import com.example.demo.service.SkillRequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillRequestServiceImpl implements SkillRequestService {

    private final SkillRequestRepository repository;

    public SkillRequestServiceImpl(SkillRequestRepository repository) {
        this.repository = repository;
    }

    @Override
    public SkillRequest create(SkillRequest request) {
        return repository.save(request);
    }

    @Override
    public SkillRequest get(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<SkillRequest> getAll() {
        return repository.findAll();
    }

    @Override
    public List<SkillRequest> getByUser(Long userId) {
        return repository.findByUserId(userId);
    }
}
