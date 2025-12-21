package com.example.demo.controller;

import com.example.demo.model.SkillMatch;
import com.example.demo.service.MatchService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matches")
public class MatchController {

    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<SkillMatch> create(@RequestParam Long offerId,
                                             @RequestParam Long requestId,
                                             @RequestParam Long adminUserId) {
        return ResponseEntity.ok(
                matchService.createMatch(offerId, requestId, adminUserId)
        );
    }

    @GetMapping
    public ResponseEntity<List<SkillMatch>> getAll() {
        return ResponseEntity.ok(matchService.getAllMatches());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SkillMatch> getById(@PathVariable Long id) {
        return ResponseEntity.ok(matchService.getMatch(id));
    }

    @PutMapping("/{id}/status")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<SkillMatch> updateStatus(@PathVariable Long id,
                                                   @RequestParam String status) {
        return ResponseEntity.ok(matchService.updateMatchStatus(id, status));
    }

    @GetMapping("/offer/{offerId}")
    public ResponseEntity<List<SkillMatch>> byOffer(@PathVariable Long offerId) {
        return ResponseEntity.ok(matchService.getMatchesByOffer(offerId));
    }

    @GetMapping("/request/{requestId}")
    public ResponseEntity<List<SkillMatch>> byRequest(@PathVariable Long requestId) {
        return ResponseEntity.ok(matchService.getMatchesByRequest(requestId));
    }
}
