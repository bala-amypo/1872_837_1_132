package com.example.demo.service;

import com.example.demo.model.MatchRecord;
import com.example.demo.model.SkillOffer;
import com.example.demo.model.SkillRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchmakingService {

    public MatchRecord match(SkillOffer offer, SkillRequest request) {
        MatchRecord record = new MatchRecord();
        record.setOffer(offer);
        record.setRequest(request);
        return record;
    }

    public List<MatchRecord> getAllMatches() {
        return List.of(new MatchRecord());
    }
}
