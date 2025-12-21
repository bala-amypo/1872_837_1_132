package com.example.demo.service.impl;

import com.example.demo.exception.BadRequestException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.SkillRequest;
import com.example.demo.repository.SkillRequestRepository;
import com.example.demo.service.SkillRequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillRequestServiceImpl implements SkillRequestService {

    private final SkillRequestRepository requestRepository;

    public SkillRequestServiceImpl(SkillRequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @Override
    public SkillRequest createRequest(SkillRequest request) {

        if (request.getSkillName() == null || request.getSkillName().length() < 3) {
            throw new BadRequestException("Skill name required");
        }

        if (request.getSkill() == null) {
            throw new BadRequestException("Skill is required");
        }

        return requestRepository.save(request);
    }

    @Override
    public SkillRequest getRequest(Long id) {
        return requestRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Request not found"));
    }

    @Override
    public List<SkillRequest> getRequestsByUser(Long userId) {
        return requestRepository.findByUserId(userId);
    }

    @Override
    public List<SkillRequest> getRequestsByCategory(Long categoryId) {
        return requestRepository.findBySkillCategoryId(categoryId);
    }

    @Override
    public List<SkillRequest> getAllRequests() {
        return requestRepository.findAll();
    }

    @Override
    public List<SkillRequest> getOpenRequests() {
        return requestRepository.findByActiveTrue();
    }
}
