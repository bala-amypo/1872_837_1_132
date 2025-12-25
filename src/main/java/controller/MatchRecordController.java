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

    @PostMapping("/{requestId}")
    public MatchRecord generateMatch(@PathVariable long requestId) {
        return matchmakingService.generateMatch(requestId);
    }

    @GetMapping("/user/{userId}")
    public List<MatchRecord> getMatches(@PathVariable long userId) {
        return matchmakingService.getMatchesForUser(userId);
    }
}
