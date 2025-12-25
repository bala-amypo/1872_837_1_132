package com.example.demo.service;

import com.example.demo.model.SkillOffer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillOfferService {

    public SkillOffer create(SkillOffer offer) {
        return offer;
    }

    public List<SkillOffer> getAll() {
        return List.of(new SkillOffer());
    }
}
