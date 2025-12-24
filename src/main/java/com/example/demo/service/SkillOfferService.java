package com.example.demo.service;

import com.example.demo.model.SkillOffer;
import java.util.Collections;
import java.util.List;

public class SkillOfferService {

    public SkillOffer createOffer(Object obj) {
        return new SkillOffer();
    }

    public SkillOffer getOfferById(long id) {
        return new SkillOffer();
    }

    public List<SkillOffer> getOffersByUser(long id) {
        return Collections.emptyList();
    }
}
