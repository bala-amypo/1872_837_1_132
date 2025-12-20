package com.example.barter.util;

import com.example.barter.model.SkillOffer;
import com.example.barter.model.SkillRequest;
import com.example.barter.model.User;
import org.springframework.stereotype.Component;

@Component
public class SkillMatchingEngine {

    public double calculateMatchScore(SkillOffer offer, SkillRequest request) {
        double score = 0.0;

        if (offer.getSkillName().equalsIgnoreCase(request.getSkillName())) {
            score += 40;
        }

        if (offer.getExperienceLevel().equalsIgnoreCase(request.getRequiredLevel())) {
            score += 30;
        }

        User offerUser = offer.getUser();
        if (offerUser != null && offerUser.getRating() != null) {
            score += Math.min(offerUser.getRating() * 6, 30);
        }

        return Math.min(score, 100.0);
    }
}
