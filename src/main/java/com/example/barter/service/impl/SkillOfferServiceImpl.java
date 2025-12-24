package com.example.barter.service.impl;

import com.example.barter.model.SkillOffer;
import com.example.barter.repository.SkillOfferRepository;
import com.example.barter.service.SkillOfferService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service   // ⭐ THIS IS CRITICAL
public class SkillOfferServiceImpl implements SkillOfferService {

    private final SkillOfferRepository offerRepository;

    public SkillOfferServiceImpl(SkillOfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public SkillOffer createOffer(SkillOffer offer) {
        return offerRepository.save(offer);
    }

    @Override
    public SkillOffer getOfferById(Long id) {
        return offerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("SkillOffer not found"));
    }

    @Override
    public List<SkillOffer> getAllOffers() {
        return offerRepository.findAll();
    }
}
