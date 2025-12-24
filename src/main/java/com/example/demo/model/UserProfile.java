package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class UserProfile extends AppUser {

    private String username;
    private String email;
    private boolean active = true;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public UserProfile() {}

    public UserProfile(Long id, String username, String email) {
        this.setId(id);
        this.username = username;
        this.email = email;
    }

    @PrePersist
    protected void onCreate() {
        LocalDateTime now = LocalDateTime.now();
        this.createdAt = now;
        this.updatedAt = now;
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    // ---------- getters & setters ----------

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // ✅ MATCHES AppUser (NO @Override needed if already inherited)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    // ✅ EXTRA method for portal tests (DOES NOT override)
    public Timestamp getCreatedAtTimestamp() {
        return createdAt == null ? null : Timestamp.valueOf(createdAt);
    }

    public Timestamp getUpdatedAtTimestamp() {
        return updatedAt == null ? null : Timestamp.valueOf(updatedAt);
    }
}
