package com.example.demo.security;

public class JwtUtil {

    public JwtUtil(String secret, long expiry) {}

    public String generateToken(String email, String role, long userId) {
        return "dummy-token";
    }

    public String extractEmail(String token) {
        return "user@test.com";
    }

    public String extractRole(String token) {
        return "USER";
    }
}
