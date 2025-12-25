package com.example.demo.model;

import java.sql.Timestamp;

public class UserProfile extends AppUser {

    private Timestamp createdAt;
    private Timestamp updatedAt;
    private boolean active = true;

    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }

    public Timestamp getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Timestamp updatedAt) { this.updatedAt = updatedAt; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}
