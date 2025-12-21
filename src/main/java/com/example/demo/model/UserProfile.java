package com.example.demo.model;

import java.sql.Timestamp;

public class UserProfile {

    private Long id;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public void setCreatedAt(Timestamp t) { this.createdAt = t; }
    public void setUpdatedAt(Timestamp t) { this.updatedAt = t; }

    public Timestamp getCreatedAt() { return createdAt; }
    public Timestamp getUpdatedAt() { return updatedAt; }
}
