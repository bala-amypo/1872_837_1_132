package com.example.demo.service;

import java.util.List;
import com.example.demo.model.MatchRecord;

public interface MatchmakingService {
    List<MatchRecord> getMatchesForUser(Long userId);
}
