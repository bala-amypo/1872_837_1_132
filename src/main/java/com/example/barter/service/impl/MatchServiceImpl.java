package com.example.barter.service.impl;

import com.example.barter.model.SkillMatch;
import com.example.barter.repository.SkillMatchRepository;
import com.example.barter.service.MatchService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    private final SkillMatchRepository matchRepository;

    public MatchServiceImpl(SkillMatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @Override
    public SkillMatch createMatch(SkillMatch match) {
        match.setStatus("PENDING");
        return matchRepository.save(match);
    }

    @Override
    public SkillMatch updateMatchStatus(Long matchId, String status) {
        SkillMatch match = matchRepository.findById(matchId)
                .orElseThrow(() -> new RuntimeException("Match not found"));

        match.setStatus(status);
        return matchRepository.save(match);
    }

    @Override
    public SkillMatch getMatchById(Long matchId) {
        return matchRepository.findById(matchId)
                .orElseThrow(() -> new RuntimeException("Match not found"));
    }

    @Override
    public List<SkillMatch> getAllMatches() {
        return matchRepository.findAll();
    }
}
