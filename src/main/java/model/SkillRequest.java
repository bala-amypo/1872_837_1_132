package com.example.demo.model;

public class SkillRequest {

    private Long id;
    private Skill skill;
    private UserProfile user;
    private String urgencyLevel;
    private boolean active;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Skill getSkill() { return skill; }
    public void setSkill(Skill skill) { this.skill = skill; }

    public UserProfile getUser() { return user; }
    public void setUser(UserProfile user) { this.user = user; }

    public String getUrgencyLevel() { return urgencyLevel; }
    public void setUrgencyLevel(String urgencyLevel) { this.urgencyLevel = urgencyLevel; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    // ✅ REQUIRED BY TEST
    public Object getBody() {
        return this;
    }
}
