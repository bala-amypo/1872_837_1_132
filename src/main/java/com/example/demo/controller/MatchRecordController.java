package com.example.demo.controller;

import com.example.demo.model.MatchRecord;
import com.example.demo.service.MatchmakingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchRecordController {

    private final MatchmakingService matchmakingService;

    public MatchRecordController(MatchmakingService matchmakingService) {
        this.matchmakingService = matchmakingService;
    }

    @PostMapping("/{userId}")
    public MatchRecord generate(@PathVariable Long userId) {
        return matchmakingService.generateMatch(userId);
    }

    @GetMapping("/{userId}")
    public List<MatchRecord> getMatches(@PathVariable Long userId) {
        return matchmakingService.getMatchesForUser(userId);
    }
}
