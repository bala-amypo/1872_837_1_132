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
    public boolean validateToken(String token) {
    return token != null && token.contains(":");
}

public String extractEmail(String token) {
    return token.split(":")[0];
}

}
