package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "skill_matches")
public class SkillMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private SkillOffer offer;

    @ManyToOne
    @JoinColumn(name = "request_id")
    private SkillRequest request;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserProfile matchedBy;

    private String matchStatus = "PENDING";
    private double matchScore = 0.0;

    public SkillMatch() {}

    // 🔥 ADD THIS
    public SkillMatch(SkillOffer offer, SkillRequest request, UserProfile matchedBy) {
        this.offer = offer;
        this.request = request;
        this.matchedBy = matchedBy;
    }

    // getters & setters
    public Long getId() { return id; }

    public String getMatchStatus() { return matchStatus; }
    public void setMatchStatus(String matchStatus) { this.matchStatus = matchStatus; }

    public double getMatchScore() { return matchScore; }
    public void setMatchScore(double matchScore) { this.matchScore = matchScore; }
}
