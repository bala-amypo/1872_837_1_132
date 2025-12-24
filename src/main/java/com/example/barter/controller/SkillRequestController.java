package com.example.barter.controller;

import com.example.barter.model.SkillRequest;
import com.example.barter.service.SkillRequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class SkillRequestController {

    private final SkillRequestService service;

    public SkillRequestController(SkillRequestService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<SkillRequest> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getRequestById(id));
    }

    @GetMapping("/open")
    public ResponseEntity<List<SkillRequest>> list() {
        return ResponseEntity.ok(service.getOpenRequests());
    }
}
