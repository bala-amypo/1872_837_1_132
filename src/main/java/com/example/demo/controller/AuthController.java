package com.example.demo.controller;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.LoginResponse;
import com.example.demo.security.JwtUtil;
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
