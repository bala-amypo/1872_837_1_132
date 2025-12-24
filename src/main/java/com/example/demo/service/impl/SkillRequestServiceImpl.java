package com.example.demo.service.impl;

import com.example.demo.model.SkillRequest;
import com.example.demo.service.SkillRequestService;

import java.util.Collections;
import java.util.List;

public class SkillRequestServiceImpl implements SkillRequestService {

    @Override
    public SkillRequest createRequest(SkillRequest request) {
        return request;
    }

    @Override
    public SkillRequest getRequest(Long id) {
        return new SkillRequest();
    }

    @Override
    public SkillRequest getRequestById(Long id) {
        return new SkillRequest();
    }

    @Override
    public List<SkillRequest> getRequestsByUser(Long userId) {
        return Collections.emptyList();
    }

    @Override
    public List<SkillRequest> getRequestsByCategory(Long categoryId) {
        return Collections.emptyList();
    }

    @Override
    public List<SkillRequest> getOpenRequests() {
        return Collections.emptyList();
    }

    @Override
    public void deleteRequest(Long id) {
        // no-op
    }
}
