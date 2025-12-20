package com.example.barter.util;

import com.example.barter.model.SkillOffer;
import com.example.barter.model.SkillRequest;
import com.example.barter.model.User;
import org.springframework.stereotype.Component;

@Component
public class SkillMatchingEngine {

    /**
     * Calculate a match score between a SkillOffer and a SkillRequest.
     * Score ranges from 0.0 to 100.0
     */
    public double calculateScore(SkillOffer offer, SkillRequest request) {
        double score = 0.0;

        // 1. Skill name exact match
        if (offer.getSkillName().equalsIgnoreCase(request.getSkillName())) {
            score += 50.0;
        }

        // 2. Experience/Required level matching
        score += calculateExperienceScore(offer.getExperienceLevel(), request.getRequiredLevel());

        // 3. User rating contribution
        User offerUser = offer.getUser();
        if (offerUser.getRating() != null) {
            score += (offerUser.getRating() / 5.0) * 20; // up to 20 points
        }

        // Ensure score does not exceed 100
        return Math.min(score, 100.0);
    }

    private double calculateExperienceScore(String offerLevel, String requestLevel) {
        if (offerLevel == null || requestLevel == null) return 0;

        // Simple scoring: exact match = 30, one level off = 15, otherwise 0
        if (offerLevel.equalsIgnoreCase(requestLevel)) {
            return 30.0;
        } else if (isOneLevelOff(offerLevel, requestLevel)) {
            return 15.0;
        }
        return 0.0;
    }

    private boolean isOneLevelOff(String offerLevel, String requestLevel) {
        // Map levels to integers
        int offer = levelToInt(offerLevel);
        int request = levelToInt(requestLevel);

        return Math.abs(offer - request) == 1;
    }

    private int levelToInt(String level) {
        switch (level.toUpperCase()) {
            case "BEGINNER": return 1;
            case "INTERMEDIATE": return 2;
            case "EXPERT": return 3;
            default: return 0;
        }
    }
}
