package com.example.barter.service.impl;

import com.example.barter.model.SkillRequest;
import com.example.barter.repository.SkillRequestRepository;
import com.example.barter.service.SkillRequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillRequestServiceImpl implements SkillRequestService {

    private final SkillRequestRepository repository;

    public SkillRequestServiceImpl(SkillRequestRepository repository) {
        this.repository = repository;
    }

    @Override
    public SkillRequest getRequestById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Request not found"));
    }

    @Override
    public List<SkillRequest> getOpenRequests() {
        return repository.findByStatus("OPEN");
    }
}
