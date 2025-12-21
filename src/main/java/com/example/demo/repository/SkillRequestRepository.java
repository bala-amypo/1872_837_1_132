package com.example.demo.repository;

import com.example.demo.model.SkillRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillRequestRepository extends JpaRepository<SkillRequest, Long> {

    List<SkillRequest> findByUserId(Long userId);

    // Correct nested property traversal
    List<SkillRequest> findBySkill_Category_Id(Long categoryId);

    // Use boolean field, not status
    List<SkillRequest> findByActiveTrue();
}
