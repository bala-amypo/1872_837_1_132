package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class SkillRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String skillName;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private SkillCategory skillCategory;

    private String status = "OPEN";

    private boolean active = true;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserProfile user;

    private LocalDateTime createdAt = LocalDateTime.now();

    /* ===== GETTERS & SETTERS ===== */

    public Long getId() {
        return id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public SkillCategory getSkillCategory() {
        return skillCategory;
    }

    public void setSkillCategory(SkillCategory skillCategory) {
        this.skillCategory = skillCategory;
    }

    public String getStatus() {
        return status;
    }

    public boolean isActive() {
        return active;
    }

    public UserProfile getUser() {
        return user;
    }

    public void setUser(UserProfile user) {
        this.user = user;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
