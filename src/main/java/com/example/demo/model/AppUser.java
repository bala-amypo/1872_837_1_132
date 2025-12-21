package com.example.demo.model;

public class AppUser {
    private Long id;
    private String email;
    private String role;

    public AppUser() {}

    public AppUser(Long id, String email, String role) {
        this.id = id;
        this.email = email;
        this.role = role;
    }

    public Long getId() { return id; }
    public String getEmail() { return email; }
    public String getRole() { return role; }
}
