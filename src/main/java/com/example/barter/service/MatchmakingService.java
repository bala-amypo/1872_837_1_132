package com.example.barter.service;

import com.example.barter.model.MatchRecord;
import java.util.List;

public interface MatchmakingService {

    MatchRecord generateMatch(Long userId);

    List<MatchRecord> getMatchesForUser(Long userId);
}
