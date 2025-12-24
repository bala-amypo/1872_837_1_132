package com.example.barter.service;

import com.example.barter.model.SkillMatch;

import java.util.List;

public interface MatchService {

    SkillMatch createMatch(SkillMatch match);

    SkillMatch updateMatchStatus(Long matchId, String status);

    SkillMatch getMatchById(Long matchId);

    List<SkillMatch> getAllMatches();

    // Required by compiler (even if logic is simple)
    List<SkillMatch> getMatchesByRequest(Long requestId);
}
