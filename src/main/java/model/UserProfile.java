package com.example.demo.model;

import java.sql.Timestamp;

public class UserProfile extends AppUser {

    private String email;
    private Timestamp updatedAt;
    private boolean active = true;

    public UserProfile() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // REQUIRED BY TEST
    public Object getBody() {
        return this;
    }
}
