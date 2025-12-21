package com.example.demo.util;

import com.example.demo.model.SkillOffer;
import com.example.demo.model.SkillRequest;
import com.example.demo.model.User;
import org.springframework.stereotype.Component;

@Component
public class SkillMatchingEngine {

    /**
     * Calculate a match score between a SkillOffer and SkillRequest.
     * You can customize scoring logic based on skill name, experience level, user rating, etc.
     */
    public double calculateMatchScore(SkillOffer offer, SkillRequest request) {
        double score = 0.0;

        // Example: exact skill name match
        if (offer.getSkillName().equalsIgnoreCase(request.getSkillName())) {
            score += 50;
        }

        // Experience/level match (example: simple numeric comparison)
        try {
            int offerLevel = Integer.parseInt(offer.getExperienceLevel());
            int requestLevel = Integer.parseInt(request.getRequiredLevel());
            if (offerLevel >= requestLevel) {
                score += 30;
            } else {
                score += (30 * offerLevel / (double) requestLevel);
            }
        } catch (NumberFormatException e) {
            // fallback: ignore numeric parsing errors
        }

        // Add user rating contribution
        User offerUser = offer.getUser();
        if (offerUser != null && offerUser.getRating() != null) {
            score += offerUser.getRating();
        }

        return score;
    }
}
