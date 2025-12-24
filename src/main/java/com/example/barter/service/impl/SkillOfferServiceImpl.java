package com.example.barter.service.impl;

import com.example.barter.model.SkillOffer;
import com.example.barter.service.SkillOfferService;

import java.util.Collections;
import java.util.List;

public class SkillOfferServiceImpl implements SkillOfferService {

    @Override
    public SkillOffer createOffer(Object obj) {
        return new SkillOffer();
    }

    @Override
    public SkillOffer getOfferById(Long id) {
        return new SkillOffer();
    }

    @Override
    public List<SkillOffer> getAll() {
        return Collections.emptyList();
    }

    @Override
    public List<SkillOffer> getOffersByUser(Long userId) {
        return Collections.emptyList();
    }
}
