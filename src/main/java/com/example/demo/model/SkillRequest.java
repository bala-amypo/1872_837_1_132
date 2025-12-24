package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class SkillRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String skillName;
    private String requiredLevel;
    private String status;

    private LocalDateTime createdAt;

    @PrePersist
    public void onCreate() {
        createdAt = LocalDateTime.now();
        status = "OPEN";
    }

    public SkillRequest() {}

    // GETTERS
    public Long getId() { return id; }
    public String getSkillName() { return skillName; }
    public String getRequiredLevel() { return requiredLevel; }
    public String getStatus() { return status; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    // SETTERS
    public void setSkillName(String skillName) { this.skillName = skillName; }
    public void setRequiredLevel(String requiredLevel) { this.requiredLevel = requiredLevel; }
    public void setStatus(String status) { this.status = status; }
}
