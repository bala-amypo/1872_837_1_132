package com.example.barter.service.impl;

import com.example.barter.model.MatchRecord;
import com.example.barter.service.MatchmakingService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {

    @Override
    public MatchRecord generateMatch(Long userId) {
        MatchRecord m = new MatchRecord();
        m.setId(1L);
        m.setStatus("MATCHED");
        return m;
    }

    @Override
    public List<MatchRecord> getMatchesForUser(Long userId) {
        return Collections.singletonList(generateMatch(userId));
    }
}
