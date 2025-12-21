package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.*;
import com.example.demo.repository.*;
import com.example.demo.service.MatchService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    private final SkillMatchRepository matchRepository;
    private final SkillOfferRepository offerRepository;
    private final SkillRequestRepository requestRepository;
    private final UserRepository userRepository;

    public MatchServiceImpl(SkillMatchRepository matchRepository,
                            SkillOfferRepository offerRepository,
                            SkillRequestRepository requestRepository,
                            UserRepository userRepository) {

        this.matchRepository = matchRepository;
        this.offerRepository = offerRepository;
        this.requestRepository = requestRepository;
        this.userRepository = userRepository;
    }

    @Override
    public SkillMatch createMatch(Long offerId, Long requestId, Long adminUserId) {

        SkillOffer offer = offerRepository.findById(offerId)
                .orElseThrow(() -> new ResourceNotFoundException("Offer not found"));

        SkillRequest request = requestRepository.findById(requestId)
                .orElseThrow(() -> new ResourceNotFoundException("Request not found"));

        User admin = userRepository.findById(adminUserId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        // 🔥 Convert User → UserProfile
        UserProfile profile = new UserProfile(
                admin.getId(),
                admin.getFullName(),   // adjust if your User has getUsername()
                admin.getEmail()
        );

        SkillMatch match = new SkillMatch(offer, request, profile);

        // CRUD-only default
        match.setMatchScore(0.0);

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
    public SkillMatch updateMatchStatus(Long matchId, String status) {
        SkillMatch match = getMatch(matchId);
        match.setMatchStatus(status);
        return matchRepository.save(match);
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
