package com.example.barter.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "skill_categories", uniqueConstraints = {
        @UniqueConstraint(columnNames = "categoryName")
})
public class SkillCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String categoryName;

    private String description;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "skillCategory")
    private List<SkillOffer> skillOffers;

    @OneToMany(mappedBy = "skillCategory")
    private List<SkillRequest> skillRequests;

    public SkillCategory() {
    }

    public SkillCategory(String categoryName, String description) {
        this.categoryName = categoryName;
        this.description = description;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    // getters and setters
}
