package com.example.barter.model;

import jakarta.persistence.*;

@Entity
public class SkillMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Status of the match (PENDING, ACCEPTED, COMPLETED, etc.)
    private String matchStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

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

    // Optional alias if some service uses setStatus()
    public void setStatus(String status) {
        this.matchStatus = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
