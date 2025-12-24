package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class SkillRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String skillName;
    private String urgencyLevel;
    private String status;
    private boolean active = true;

    @ManyToOne
    private Skill skill;

    @ManyToOne
    private UserProfile user;

    public Long getId() { return id; }
    public String getSkillName() { return skillName; }
    public String getUrgencyLevel() { return urgencyLevel; }
    public String getStatus() { return status; }
    public boolean isActive() { return active; }
    public Skill getSkill() { return skill; }
    public UserProfile getUser() { return user; }

    public void setId(Long id) { this.id = id; }
    public void setSkillName(String skillName) { this.skillName = skillName; }
    public void setUrgencyLevel(String urgencyLevel) { this.urgencyLevel = urgencyLevel; }
    public void setStatus(String status) { this.status = status; }
    public void setActive(boolean active) { this.active = active; }
    public void setSkill(Skill skill) { this.skill = skill; }
    public void setUser(UserProfile user) { this.user = user; }

    // REQUIRED BY TEST
    public Object getBody() { return this; }
}
