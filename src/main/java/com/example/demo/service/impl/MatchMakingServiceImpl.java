package com.example.demo.service.impl;

import com.example.demo.model.MatchRecord;
import com.example.demo.service.MatchmakingService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {

    @Override
    public String findMatches() {
        return "matches";
    }

    @Override
    public List<MatchRecord> getMatchesForUser(Long userId) {
        return Collections.emptyList();
    }
}
