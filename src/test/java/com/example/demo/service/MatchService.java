package com.example.demo.service;

import com.example.demo.model.SkillMatch;
import java.util.List;

public interface MatchService {

    SkillMatch createMatch(SkillMatch match);

    SkillMatch updateMatchStatus(Long matchId, String status);

    SkillMatch getMatchById(Long matchId);

    List<SkillMatch> getAllMatches();
}
