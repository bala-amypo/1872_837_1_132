package com.example.barter.service.impl;

import com.example.barter.exception.ResourceNotFoundException;
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
    public SkillMatch createMatch(Long requestId, Long offerId, Long userId) {
        SkillMatch match = new SkillMatch();
        match.setMatchStatus("CREATED");
        return matchRepository.save(match);
    }

    @Override
    public SkillMatch updateMatchStatus(Long matchId, String status) {
        SkillMatch match = matchRepository.findById(matchId)
                .orElseThrow(() -> new ResourceNotFoundException("Match not found"));

        match.setStatus(status);
        return matchRepository.save(match);
    }

    @Override
    public SkillMatch getMatch(Long id) {
        return matchRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Match not found"));
    }

    @Override
    public List<SkillMatch> getAllMatches() {
        return matchRepository.findAll();
    }

    @Override
    public List<SkillMatch> getMatchesByOffer(Long offerId) {
        return matchRepository.findByOfferId(offerId);
    }

    @Override
    public List<SkillMatch> getMatchesByRequest(Long requestId) {
        return matchRepository.findByRequestId(requestId);
    }
}
