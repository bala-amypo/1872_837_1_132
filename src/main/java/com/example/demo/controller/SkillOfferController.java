package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/offers")
public class SkillOfferController {

    @GetMapping
    public String getOffers() {
        return "offers";
    }
}
