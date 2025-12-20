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
    private String matchStatus = "PENDING"; // PENDING/ACCEPTED/REJECTED/COMPLETED

    @Column(nullable = false)
    private Double matchScore = 0.0;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "match")
    private List<BarterTransaction> barterTransactions;

    public SkillMatch() {}

    public SkillMatch(SkillOffer offer, SkillRequest request, User matchedBy) {
        this.offer = offer;
        this.request = request;
        this.matchedBy = matchedBy;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    // Getters & Setters
    public Long getId() { return id; }
    public SkillOffer getOffer() { return offer; }
    public void setOffer(SkillOffer offer) { this.offer = offer; }
    public SkillRequest getRequest() { return request; }
    public void setRequest(SkillRequest request) { this.request = request; }
    public User getMatchedBy() { return matchedBy; }
    public void setMatchedBy(User matchedBy) { this.matchedBy = matchedBy; }
    public String getMatchStatus() { return matchStatus; }
    public void setMatchStatus(String matchStatus) { this.matchStatus = matchStatus; }
    public Double getMatchScore() { return matchScore; }
    public void setMatchScore(Double matchScore) { this.matchScore = matchScore; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public List<BarterTransaction> getBarterTransactions() { return barterTransactions; }
    public void setBarterTransactions(List<BarterTransaction> barterTransactions) { this.barterTransactions = barterTransactions; }
}
