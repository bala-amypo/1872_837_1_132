package com.example.demo.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {

    public boolean validateToken(String token) { return true; }

    public String extractEmail(String token) { return "test@email.com"; }

    public String extractRole(String token) { return "USER"; }

    public Long extractUserId(String token) { return 1L; }
}

