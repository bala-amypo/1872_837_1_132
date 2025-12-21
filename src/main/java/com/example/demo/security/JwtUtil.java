package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    private final String secret;
    private final long expiration;

    public JwtUtil(String secret, long expiration) {
        this.secret = secret;
        this.expiration = expiration;
    }

    public String generateToken(String email, String role, long userId) {
        return "token-" + email + "-" + role + "-" + userId;
    }

    public boolean validateToken(String token) {
        return token != null;
    }

    public String extractEmail(String token) {
        return token.split("-")[1];
    }

    public String extractRole(String token) {
        return token.split("-")[2];
    }

    public long extractUserId(String token) {
        return Long.parseLong(token.split("-")[3]);
    }
}
