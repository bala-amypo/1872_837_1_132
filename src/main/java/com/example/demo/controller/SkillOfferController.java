package com.example.demo.controller;

import com.example.demo.model.SkillOffer;
import com.example.demo.service.SkillOfferService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skill-offers")
public class SkillOfferController {

    private final SkillOfferService skillOfferService;

    public SkillOfferController(SkillOfferService skillOfferService) {
        this.skillOfferService = skillOfferService;
    }

    @PostMapping
    public SkillOffer create(@RequestBody SkillOffer offer) {
        return skillOfferService.create(offer);
    }

    @GetMapping("/{id}")
    public SkillOffer get(@PathVariable Long id) {
        return skillOfferService.get(id);
    }

    @GetMapping
    public List<SkillOffer> getAll() {
        return skillOfferService.getAll();
    }
}
