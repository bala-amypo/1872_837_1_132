package com.example.barter.util;

import com.example.barter.model.SkillOffer;
import com.example.barter.model.SkillRequest;
import com.example.barter.model.User;
import org.springframework.stereotype.Component;

@Component
public class SkillMatchingEngine {

    public double calculateMatchScore(SkillOffer offer, SkillRequest request) {
        double score = 0.0;

        // Example simple scoring logic
        if (offer.getSkillName().equalsIgnoreCase(request.getSkillName())) {
            score += 50;
        }

        if (offer.getExperienceLevel() >= request.getRequiredLevel()) {
            score += 30;
        }

        User offerUser = offer.getUser();
        if (offerUser != null) {
            score += offerUser.getRating(); // Add rating to score
        }

        return score;
    }
}
