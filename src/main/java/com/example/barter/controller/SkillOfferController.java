package com.example.barter.controller;

import com.example.barter.model.SkillOffer;
import com.example.barter.service.SkillOfferService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/offers")
public class SkillOfferController {

    private final SkillOfferService skillOfferService;

    public SkillOfferController(SkillOfferService skillOfferService) {
        this.skillOfferService = skillOfferService;
    }

    // CREATE offer
    @PostMapping
    public ResponseEntity<SkillOffer> createOffer(
            @RequestBody SkillOffer offer) {

        return ResponseEntity.ok(
                skillOfferService.createOffer(offer)
        );
    }

    // GET offer by ID
    @GetMapping("/{id}")
    public ResponseEntity<SkillOffer> getOffer(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                skillOfferService.getOfferById(id)
        );
    }

    // GET all offers
    @GetMapping
    public ResponseEntity<List<SkillOffer>> getAllOffers() {
        return ResponseEntity.ok(
                skillOfferService.getAllOffers()
        );
    }
}
