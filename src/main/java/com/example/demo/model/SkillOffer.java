package com.example.barter.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "skill_offers")
public class SkillOffer {

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

    @Column(length = 1000)
    private String description;

    @Column(nullable = false)
    private String experienceLevel;

    @Column(nullable = false)
    private String availability = "AVAILABLE";

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "offer")
    private List<SkillMatch> matches;

    public SkillOffer() {
    }

    public SkillOffer(User user, SkillCategory skillCategory, String skillName, String experienceLevel) {
        this.user = user;
        this.skillCategory = skillCategory;
        this.skillName = skillName;
        this.experienceLevel = experienceLevel;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        if (this.availability == null) {
            this.availability = "AVAILABLE";
        }
    }

    // getters and setters
}
