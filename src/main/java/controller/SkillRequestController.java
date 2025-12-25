package com.example.demo.controller;

import com.example.demo.model.SkillRequest;
import com.example.demo.service.SkillRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/requests")
public class SkillRequestController {

    private final SkillRequestService service;

    public SkillRequestController(SkillRequestService service) {
        this.service = service;
    }

    @PostMapping
    public SkillRequest create(@RequestBody SkillRequest request) {
        return service.createRequest(request);
    }

    @GetMapping("/{id}")
    public SkillRequest get(@PathVariable long id) {
        return service.getRequestById(id);
    }

    @GetMapping("/user/{userId}")
    public List<SkillRequest> getByUser(@PathVariable long userId) {
        return service.getRequestsByUser(userId);
    }
}
