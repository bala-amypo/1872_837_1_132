package com.example.demo.controller;

import com.example.demo.model.MatchRecord;
import com.example.demo.service.MatchRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchRecordController {

    private final MatchRecordService service;

    public MatchRecordController(MatchRecordService service) {
        this.service = service;
    }

    @PostMapping
    public MatchRecord create(@RequestBody MatchRecord match) {
        return service.create(match);
    }

    @GetMapping
    public List<MatchRecord> getAll() {
        return service.getAll();
    }
}
