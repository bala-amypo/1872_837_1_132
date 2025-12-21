package com.example.demo.model;

public class SkillRequest {

    private Long id;
    private Skill skill;
    private UserProfile user;
    private boolean active = true;

    public SkillRequest() {}

    // ===== REQUIRED =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getSkillName() {
        return skill != null ? skill.getName() : null;
    }

    public String getSkillCategory() {
        return skill != null ? skill.getCategory() : null;
    }

    public UserProfile getUser() {
        return user;
    }

    public void setUser(UserProfile user) {
        this.user = user;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
