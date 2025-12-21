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

    private final SkillRequestRepository repository;

    public SkillRequestServiceImpl(SkillRequestRepository repository) {
        this.repository = repository;
    }

    @Override
    public SkillRequest createRequest(SkillRequest request) {
        if (request.getSkillName() == null || request.getSkillName().length() < 5) {
            throw new BadRequestException("Skill name must be at least 5 characters");
        }
        return repository.save(request);
    }

    @Override
    public SkillRequest getRequest(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Request not found"));
    }

    @Override
    public List<SkillRequest> getRequestsByUser(Long userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<SkillRequest> getRequestsByCategory(Long categoryId) {
        return repository.findBySkillCategoryId(categoryId);
    }

    @Override
    public List<SkillRequest> getOpenRequests() {
        return repository.findByStatus("OPEN");
    }
@Override
public void deleteRequest(Long id) {
    if (!repository.existsById(id)) {
        throw new ResourceNotFoundException("Skill request not found with id: " + id);
    }
    repository.deleteById(id);
}


}
