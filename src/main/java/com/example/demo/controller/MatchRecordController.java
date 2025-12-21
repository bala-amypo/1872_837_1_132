package com.example.demo.controller;

import com.example.demo.service.MatchmakingService;
import org.springframework.web.bind.annotation.*;

@RestController
public class MatchRecordController {

    private final MatchmakingService service;

    public MatchRecordController(MatchmakingService service) {
        this.service = service;
    }

    @GetMapping("/matches/{userId}")
    public Object getMatchesForUser(Long userId) {
        return service.getMatchesForUser(userId);
    }
}
