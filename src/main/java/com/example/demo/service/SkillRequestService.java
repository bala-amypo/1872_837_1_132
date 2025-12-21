package com.example.demo.service.SkillRequestService;

public interface SkillRequestService {

    SkillRequest create(SkillRequest request);
    SkillRequest createRequest(SkillRequest request);

    SkillRequest getRequest(Long id);
    SkillRequest getRequestById(Long id);

    List<SkillRequest> getRequestsByUser(Long userId);
    List<SkillRequest> getRequestsByCategory(Long categoryId);

    List<SkillRequest> getAllRequests();
    List<SkillRequest> getOpenRequests();
}
