package com.example.demo.service;

import com.example.demo.model.SkillOffer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillOfferService {

    public List<SkillOffer> getOffersByUser(long userId) {
        return List.of(new SkillOffer());
    }
}
