package com.example.barter.service;

import com.example.barter.model.SkillMatch;
import java.util.List;

public interface MatchService {

    SkillMatch createMatch(Long requestId, Long offerId, Long userId);

    SkillMatch updateMatchStatus(Long matchId, String status);

    SkillMatch getMatch(Long id);

    List<SkillMatch> getAllMatches();

    List<SkillMatch> getMatchesByOffer(Long offerId);

    List<SkillMatch> getMatchesByRequest(Long requestId);
}
