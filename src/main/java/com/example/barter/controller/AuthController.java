package com.example.barter.controller;

import com.example.barter.dto.LoginRequest;
import com.example.barter.dto.LoginResponse;
import com.example.barter.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {

        // TEMP: No DB validation (for assignment/demo)
        String token = jwtUtil.generateToken(
                request.getEmail(),
                "USER",
                1L
        );

        return new LoginResponse(token, "USER");
    }
}
    