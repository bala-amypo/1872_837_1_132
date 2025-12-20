package com.example.barter.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "skill_requests")
public class SkillRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "category_id")
    private SkillCategory skillCategory;

    @Column(nullable = false)
    private String skillName;

    @Column(nullable = false)
    private String requiredLevel; // BEGINNER/INTERMEDIATE/EXPERT

    @Column(nullable = false)
    private String status = "OPEN"; // OPEN/MATCHED/COMPLETED

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "request")
    private List<SkillMatch> skillMatches;

    public SkillRequest() {}

    public SkillRequest(User user, SkillCategory skillCategory, String skillName, String requiredLevel) {
        this.user = user;
        this.skillCategory = skillCategory;
        this.skillName = skillName;
        this.requiredLevel = requiredLevel;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    // Getters & Setters
    public Long getId() { return id; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public SkillCategory getSkillCategory() { return skillCategory; }
    public void setSkillCategory(SkillCategory skillCategory) { this.skillCategory = skillCategory; }
    public String getSkillName() { return skillName; }
    public void setSkillName(String skillName) { this.skillName = skillName; }
    public String getRequiredLevel() { return requiredLevel; }
    public void setRequiredLevel(String requiredLevel) { this.requiredLevel = requiredLevel; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public List<SkillMatch> getSkillMatches() { return skillMatches; }
    public void setSkillMatches(List<SkillMatch> skillMatches) { this.skillMatches = skillMatches; }
}
