package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    private String experienceLevel;
    private String urgencyLevel;
    private boolean active;
    private String name;

    public Skill() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getExperienceLevel() { return experienceLevel; }
    public String getUrgencyLevel() { return urgencyLevel; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public void setActive(boolean active) { this.active = active; }
    public boolean isActive() { return true; }
    public String getCategory() { return ""; }
}
