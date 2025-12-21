package com.example.demo.controller;

import com.example.demo.service.MatchmakingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matches")
public class MatchRecordController {

    private final MatchmakingService matchmakingService;

    public MatchRecordController(MatchmakingService matchmakingService) {
        this.matchmakingService = matchmakingService;
    }

    @GetMapping("/{userId}")
    public Object getMatches(@PathVariable Long userId) {
        return matchingService.getMatchesForUser(userId);
    }
}
