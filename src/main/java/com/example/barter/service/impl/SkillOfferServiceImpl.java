package com.example.barter.service.impl;

import com.example.barter.model.SkillOffer;
import com.example.barter.repository.SkillOfferRepository;
import com.example.barter.service.SkillOfferService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillOfferServiceImpl implements SkillOfferService {

    private final SkillOfferRepository repository;

    public SkillOfferServiceImpl(SkillOfferRepository repository) {
        this.repository = repository;
    }

    @Override
    public SkillOffer createOffer(SkillOffer offer) {
        return repository.save(offer);
    }

    @Override
    public SkillOffer getOfferById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<SkillOffer> getAllOffers() {
        return repository.findAll();
    }
}
