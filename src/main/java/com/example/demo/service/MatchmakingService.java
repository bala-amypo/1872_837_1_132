package com.example.demo.service;

import java.util.List;
import com.example.demo.model.MatchRecord;

public interface MatchmakingService {
    String findMatches();
    List<MatchRecord> getMatchesForUser(Long userId);
}
