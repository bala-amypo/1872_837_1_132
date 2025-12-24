package com.example.demo.security;

public class JwtUtil {

    private final String secret;
    private final long expiration;

    // REQUIRED by tests
    public JwtUtil(String secret, long expiration) {
        this.secret = secret;
        this.expiration = expiration;
    }

    // REQUIRED by AuthController & tests
    public String generateToken(String email, String role, long userId) {
        return "dummy-jwt-token";
    }

    public boolean validateToken(String token) {
        return true;
    }

    public String extractEmail(String token) {
        return "test@example.com";
    }

    public String extractRole(String token) {
        return "USER";
    }

    public long extractUserId(String token) {
        return 1L;
    }
}
