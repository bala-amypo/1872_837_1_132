package com.example.demo.service;

import com.example.demo.model.SkillOffer;
import java.util.List;

public interface SkillOfferService {

    SkillOffer createOffer(Object obj);

    SkillOffer getOfferById(Long id);

    List<SkillOffer> getAll();

    List<SkillOffer> getOffersByUser(Long userId);
}
