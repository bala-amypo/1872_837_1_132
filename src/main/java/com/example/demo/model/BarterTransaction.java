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
    private String status = "INITIATED";

    private String offererFeedback;
    private String requesterFeedback;

    private Integer offererRating;
    private Integer requesterRating;

    private LocalDateTime completedAt;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    public BarterTransaction() {
    }

    public BarterTransaction(SkillMatch match) {
        this.match = match;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        if (this.status == null) {
            this.status = "INITIATED";
        }
    }

    // getters and setters
}
