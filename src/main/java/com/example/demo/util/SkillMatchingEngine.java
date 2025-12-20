// package com.example.barter.util;

// import com.example.barter.model.SkillOffer;
// import com.example.barter.model.SkillRequest;
// import com.example.barter.model.User;

// public class SkillMatchingEngine {

//     public double calculateMatchScore(SkillOffer offer,
//                                       SkillRequest request) {

//         double score = 0.0;

//         // Skill name similarity
//         if (offer.getSkillName().equalsIgnoreCase(request.getSkillName())) {
//             score += 40;
//         }

//         // Experience level match
//         if (offer.getExperienceLevel().equalsIgnoreCase(request.getRequiredLevel())) {
//             score += 30;
//         }

//         // User rating influence
//         User offerUser = offer.getUser();
//         if (offerUser != null && offerUser.getRating() != null) {
//             score += Math.min(offerUser.getRating() * 6, 30);
//         }

//         // Cap score at 100
//         return Math.min(score, 100.0);
//     }
// }
