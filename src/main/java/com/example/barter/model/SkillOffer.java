package com.example.barter.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class SkillOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String skillName;
    private String experienceLevel;
    private String availability;

    private LocalDateTime createdAt;

    @PrePersist
    public void onCreate() {
        createdAt = LocalDateTime.now();
        availability = "AVAILABLE";
    }

    public SkillOffer() {}

    // GETTERS
    public Long getId() { return id; }
    public String getSkillName() { return skillName; }
    public String getExperienceLevel() { return experienceLevel; }
    public String getAvailability() { return availability; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    // SETTERS
    public void setSkillName(String skillName) { this.skillName = skillName; }
    public void setExperienceLevel(String experienceLevel) { this.experienceLevel = experienceLevel; }
    public void setAvailability(String availability) { this.availability = availability; }
}
