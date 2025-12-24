package com.example.barter.controller;

import com.example.barter.dto.LoginRequest;
import com.example.barter.dto.LoginResponse;
import com.example.barter.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    private final JwtUtil jwtUtil = new JwtUtil("secret", 100000);

    @PostMapping("/login")
    public LoginResponse login(LoginRequest request) {
        String token = jwtUtil.generateToken(request.getEmail(), "USER", 1L);
        return new LoginResponse(token, "USER");
    }
}
