package com.example.barter.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "barter_transactions")
public class BarterTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "match_id")
    private SkillMatch match;

    @Column(nullable = false)
    private String status = "INITIATED"; // INITIATED/COMPLETED/CANCELLED

    private String offererFeedback;
    private String requesterFeedback;

    private Integer offererRating;
    private Integer requesterRating;

    private LocalDateTime completedAt;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    public BarterTransaction() {}

    public BarterTransaction(SkillMatch match) {
        this.match = match;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    // Getters & Setters
    public Long getId() { return id; }
    public SkillMatch getMatch() { return match; }
    public void setMatch(SkillMatch match) { this.match = match; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getOffererFeedback() { return offererFeedback; }
    public void setOffererFeedback(String offererFeedback) { this.offererFeedback = offererFeedback; }
    public String getRequesterFeedback() { return requesterFeedback; }
    public void setRequesterFeedback(String requesterFeedback) { this.requesterFeedback = requesterFeedback; }
    public Integer getOffererRating() { return offererRating; }
    public void setOffererRating(Integer offererRating) { this.offererRating = offererRating; }
    public Integer getRequesterRating() { return requesterRating; }
    public void setRequesterRating(Integer requesterRating) { this.requesterRating = requesterRating; }
    public LocalDateTime getCompletedAt() { return completedAt; }
    public void setCompletedAt(LocalDateTime completedAt) { this.completedAt = completedAt; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}
