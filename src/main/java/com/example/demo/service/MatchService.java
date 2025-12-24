package com.example.demo.service;

import com.example.demo.model.SkillMatch;
import java.util.List;

public interface MatchService {

    SkillMatch getMatch(Long id);

    List<SkillMatch> getAllMatches();

    List<SkillMatch> getMatchesByOffer(Long offerId);

    List<SkillMatch> getMatchesByRequest(Long requestId);
}
