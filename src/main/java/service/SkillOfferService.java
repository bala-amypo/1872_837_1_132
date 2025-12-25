package com.example.demo.service;

import com.example.demo.model.SkillOffer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillOfferService {

    public SkillOffer createOffer(Object obj) {
        return (SkillOffer) obj;
    }

    public SkillOffer getOfferById(long id) {
        SkillOffer offer = new SkillOffer();
        offer.setId(id);
        return offer;
    }

    // ✅ THIS IS WHAT YOUR ERROR IS ASKING FOR
    public List<SkillOffer> getOffersByUser(long userId) {
        return List.of(new SkillOffer());
    }
}
