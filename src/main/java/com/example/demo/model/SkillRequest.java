package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class SkillRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String skillName;

    private String urgencyLevel;

    // 🔥 ADD THIS FIELD
    private String status = "OPEN";

    private boolean active = true;

    @ManyToOne
    private Skill skill;

    @ManyToOne
    private SkillCategory skillCategory;

    @ManyToOne
    private UserProfile user;

    /* ===== REQUIRED GETTERS / SETTERS ===== */

    public Long getId() {
        return id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(String urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public SkillCategory getSkillCategory() {
        return skillCategory;
    }

    public void setSkillCategory(SkillCategory skillCategory) {
        this.skillCategory = skillCategory;
    }

    public UserProfile getUser() {
        return user;
    }

    public void setUser(UserProfile user) {
        this.user = user;
    }
    public Object getBody() { return null; }
}
