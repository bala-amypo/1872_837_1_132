package com.example.barter.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private boolean active = true;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public UserProfile() {}

    public UserProfile(Long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = this.createdAt;
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    // REQUIRED BY TESTS
    public Long getId() { return id; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public boolean isActive() { return active; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }

    public void setId(Long id) { this.id = id; }
    public void setUsername(String username) { this.username = username; }
    public void setEmail(String email) { this.email = email; }
    public void setActive(boolean active) { this.active = active; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
