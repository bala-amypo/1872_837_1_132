package com.example.demo.controller;

import com.example.demo.model.SkillOffer;
import org.springframework.web.bind.annotation.*;

@RestController
public class SkillOfferController {

    @PostMapping("/offers")
    public SkillOffer create(SkillOffer offer) {
        return offer;
    }
}
