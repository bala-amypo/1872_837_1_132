package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private String experienceLevel;
    private String urgencyLevel;
    private boolean active;

    public Skill() {
    }

    // ---------- ID ----------
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // ---------- NAME ----------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ---------- CATEGORY ----------
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // ---------- EXPERIENCE LEVEL ----------
    public String getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    // ---------- URGENCY LEVEL ----------
    public String getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(String urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }

    // ---------- ACTIVE ----------
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // ---------- REQUIRED FOR PORTAL TESTS ----------
    public Object getBody() {
        return this;
    }
}
