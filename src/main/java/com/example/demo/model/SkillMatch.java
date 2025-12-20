package com.example.barter.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "skill_matches")
public class SkillMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "offer_id")
    private SkillOffer offer;

    @ManyToOne(optional = false)
    @JoinColumn(name = "request_id")
    private SkillRequest request;

    @ManyToOne(optional = false)
    @JoinColumn(name = "matched_by")
    private User matchedBy;

    @Column(nullable = false)
    private String matchStatus = "PENDING";

    @Column(nullable = false)
    private Double matchScore = 0.0;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "match")
    private List<BarterTransaction> transactions;

    public SkillMatch() {
    }

    public SkillMatch(SkillOffer offer, SkillRequest request, User matchedBy) {
        this.offer = offer;
        this.request = request;
        this.matchedBy = matchedBy;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        if (this.matchStatus == null) {
            this.matchStatus = "PENDING";
        }
        if (this.matchScore == null) {
            this.matchScore = 0.0;
        }
    }

    // getters and setters
}
