package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class SkillMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String matchStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User matchedBy;

    public SkillMatch() {}

    public Long getId() {
        return id;
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    public void setStatus(String status) {
        this.matchStatus = status;
    }

    public User getMatchedBy() {
        return matchedBy;
    }

    public void setMatchedBy(User matchedBy) {
        this.matchedBy = matchedBy;
    }
}
