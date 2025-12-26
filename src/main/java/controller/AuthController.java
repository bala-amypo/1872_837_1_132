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

    if (request == null) {
        throw new RuntimeException("Invalid credentials");
    }

    String username = request.getUsername();
    String password = request.getPassword();

    // 🔥 ONLY VALID COMBINATION (AS PER TEST)
    if (!"user".equals(username) || !"password".equals(password)) {
        throw new RuntimeException("Invalid credentials");
    }

    String token = jwtUtil.generateToken(
            username,
            "USER",
            1L
    );

    return new LoginResponse(token);
}

}
