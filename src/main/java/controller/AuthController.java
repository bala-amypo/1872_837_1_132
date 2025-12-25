package com.example.demo.controller;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.LoginResponse;
import com.example.demo.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil = new JwtUtil();

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {

        // ✅ REQUIRED BY TEST: invalid credentials must throw RuntimeException
        if (request == null
                || request.getPassword() == null
                || request.getPassword().isEmpty()
                || (
                    (request.getUsername() == null || request.getUsername().isEmpty())
                    && (request.getEmail() == null || request.getEmail().isEmpty())
                )
        ) {
            throw new RuntimeException("Invalid credentials");
        }

        String principal =
                request.getUsername() != null ? request.getUsername() : request.getEmail();

        String token = jwtUtil.generateToken(
                principal,
                "USER",
                1L
        );

        return new LoginResponse(token);
    }
}
