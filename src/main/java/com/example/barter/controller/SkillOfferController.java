package com.example.demo.controller;

import com.example.demo.model.SkillOffer;
import com.example.demo.service.SkillOfferService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/offers")
public class SkillOfferController {

    private final SkillOfferService skillOfferService;

    public SkillOfferController(SkillOfferService skillOfferService) {
        this.skillOfferService = skillOfferService;
    }

    // CREATE
    @PostMapping
    public SkillOffer create(@RequestBody SkillOffer offer) {
        return skillOfferService.createOffer(offer);   // ✅ FIXED
    }

    // READ BY ID
    @GetMapping("/{id}")
    public SkillOffer get(@PathVariable Long id) {
        return skillOfferService.getOfferById(id);     // ✅ FIXED
    }

    // READ ALL
    @GetMapping
    public List<SkillOffer> getAll() {
        return skillOfferService.getAll();              // ✅ CONSISTENT
    }
}
