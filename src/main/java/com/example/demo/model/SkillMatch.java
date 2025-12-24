package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class SkillMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private SkillOffer offer;

    @ManyToOne
    private SkillRequest request;

    @ManyToOne
    private UserProfile matchedBy;

    private String status;

    private Double matchScore;

    public SkillMatch() {
    }

    public SkillMatch(SkillOffer offer, SkillRequest request, UserProfile matchedBy) {
        this.offer = offer;
        this.request = request;
        this.matchedBy = matchedBy;
        this.status = "PENDING";
    }

    /* ===== GETTERS & SETTERS ===== */

    public Long getId() {
        return id;
    }

    public SkillOffer getOffer() {
        return offer;
    }

    public void setOffer(SkillOffer offer) {
        this.offer = offer;
    }

    public SkillRequest getRequest() {
        return request;
    }

    public void setRequest(SkillRequest request) {
        this.request = request;
    }

    public UserProfile getMatchedBy() {
        return matchedBy;
    }

    public void setMatchedBy(UserProfile matchedBy) {
        this.matchedBy = matchedBy;
    }

    public Double getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(Double matchScore) {
        this.matchScore = matchScore;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /* ===== REQUIRED FOR YOUR ERROR FIX ===== */

    public String getMatchStatus() {
        return status;
    }
}
