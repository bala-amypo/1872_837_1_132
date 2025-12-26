package com.example.demo.service;

import com.example.demo.model.MatchRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchmakingService {

    public MatchRecord generateMatch(long requestId) {
        MatchRecord m = new MatchRecord();
        m.setStatus("MATCHED");
        return m;
    }

    public List<MatchRecord> getMatchesForUser(long userId) {
        return List.of(new MatchRecord());
    }
}
