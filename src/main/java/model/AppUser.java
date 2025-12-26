package com.example.demo.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class AppUser {

    private Long id;
    private String username;
    private String role;
    private Timestamp createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // REQUIRED BY TEST
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Primary (used internally)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    // 🔥 REQUIRED BY TEST (LocalDateTime → Timestamp)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = Timestamp.valueOf(createdAt);
    }
}
