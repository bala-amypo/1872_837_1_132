package com.example.demo.controller;

import com.example.demo.service.MatchingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matches")
public class MatchRecordController {

    private final MatchingService matchingService;

    public MatchRecordController(MatchingService matchingService) {
        this.matchingService = matchingService;
    }

    @GetMapping
    public String getMatches() {
        return matchingService.findMatches();
    }
}
