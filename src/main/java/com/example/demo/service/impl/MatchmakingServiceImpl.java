package com.example.demo.serviceimpl;

import com.example.demo.model.MatchRecord;
import com.example.demo.service.MatchmakingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {

    @Override
    public List<MatchRecord> getMatchesForUser(Long userId) {
        return List.of(new MatchRecord(1L, "MATCHED"));
    }
}
