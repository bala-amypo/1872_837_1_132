package com.example.demo.model;

public class UserProfile extends AppUser {
    private String email;
    private boolean active = true;

    public UserProfile() {}

    public UserProfile(Long id, String username, String email) {
        setId(id);
        setUsername(username);
        this.email = email;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
    public Object getBody() {
    return this;
}

}
