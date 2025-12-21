package com.example.demo.controller;

import com.example.demo.service.MatchmakingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matches")
public class MatchRecordController {

    private final MatchmakingService matchmakingService;

    public MatchRecordController(MatchmakingService matchmakingService) {
        this.matchmakingService = matchmakingService;
    }

    @GetMapping
    public String getMatches() {
        return matchmakingService.runMatchmaking();
    }
}
