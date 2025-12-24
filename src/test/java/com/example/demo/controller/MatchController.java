package com.example.demo.controller;

import com.example.demo.model.SkillMatch;
import com.example.demo.service.MatchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matches")
public class MatchController {

    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    // ✅ CREATE MATCH (FIXED)
    @PostMapping
    public SkillMatch createMatch(@RequestBody SkillMatch match) {
        return matchService.createMatch(match);
    }

    // ✅ GET MATCH BY ID
    @GetMapping("/{id}")
    public SkillMatch getMatchById(@PathVariable Long id) {
        return matchService.getMatchById(id);
    }

    // ✅ GET ALL MATCHES
    @GetMapping
    public List<SkillMatch> getAllMatches() {
        return matchService.getAllMatches();
    }

    // ✅ UPDATE STATUS
    @PutMapping("/{id}/status")
    public SkillMatch updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        return matchService.updateMatchStatus(id, status);
    }
}
