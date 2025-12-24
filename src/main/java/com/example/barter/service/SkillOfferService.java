package com.example.barter.service;

import com.example.barter.model.SkillOffer;
import java.util.List;

public interface SkillOfferService {

    SkillOffer createOffer(SkillOffer offer);

    SkillOffer getOfferById(Long id);

    List<SkillOffer> getAllOffers();
}
