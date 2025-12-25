package com.example.demo.security;

public class JwtUtil {

    public String generateToken(String username, String role, long userId) {
        return username + ":" + role + ":" + userId;
    }

    public String extractRole(String token) {
        return token.split(":")[1];
    }

    public Long extractUserId(String token) {
        return Long.parseLong(token.split(":")[2]);
    }
}
