package com.example.demo.service;

import com.example.demo.model.MatchRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchRecordService {

    public MatchRecord create(MatchRecord match) {
        return match;
    }

    public List<MatchRecord> getAll() {
        return List.of(new MatchRecord());
    }
}
