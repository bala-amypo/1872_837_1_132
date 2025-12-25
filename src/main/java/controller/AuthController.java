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
        String token = jwtUtil.generateToken(request.getUsername());
        return new LoginResponse(token);
    }
}
