package com.example.demo.model;

import java.sql.Timestamp;

public class UserProfile {

    private Long id;
    private String name;
    private String email;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public UserProfile() {}

    // 👇 REQUIRED BY TESTS
    public UserProfile(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() { return id; }

    public void setCreatedAt(Timestamp t) { this.createdAt = t; }
    public void setUpdatedAt(Timestamp t) { this.updatedAt = t; }

    public Timestamp getCreatedAt() { return createdAt; }
    public Timestamp getUpdatedAt() { return updatedAt; }
}
