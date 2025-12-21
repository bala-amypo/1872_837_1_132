public interface SkillRequestService {

    SkillRequest createRequest(SkillRequest request);

    SkillRequest getRequest(Long id);

    List<SkillRequest> getRequestsByUser(Long userId);

    List<SkillRequest> getRequestsByCategory(Long categoryId);

    List<SkillRequest> getOpenRequests();

    // 🔥 ADD THIS
    void deleteRequest(Long id);
}
