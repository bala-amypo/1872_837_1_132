package com.example.demo.service.impl;

import com.example.demo.model.SkillOffer;
import com.example.demo.service.SkillOfferService;

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
