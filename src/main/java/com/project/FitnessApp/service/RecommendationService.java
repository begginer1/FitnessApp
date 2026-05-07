package com.project.FitnessApp.service;

import com.project.FitnessApp.dto.RecommendationRequest;
import com.project.FitnessApp.entity.Activity;
import com.project.FitnessApp.entity.Recommendation;
import com.project.FitnessApp.entity.User;
import com.project.FitnessApp.repository.ActivityRepository;
import com.project.FitnessApp.repository.RecommendationRepository;
import com.project.FitnessApp.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
@Builder
public class RecommendationService {

    private final RecommendationRepository RecommendationRepository;
    private final ActivityRepository activityRepository;
    private final UserRepository userRepository;

    public Recommendation generateRecommendation(RecommendationRequest request) {

        User user = userRepository.findById(request.getUserId()).orElseThrow(() -> new RuntimeException("User Not found"));

        Activity activity = activityRepository.findById(request.getActivityId()).orElseThrow(() -> new RuntimeException("Not found ActivityId"));

        Recommendation recommendation = Recommendation.builder()
                .user(user)
                .activity(activity)
                .improvements(request.getImprovements())
                .safety(request.getSafety())
                .suggestions(request.getSuggestions())
                .build();
        return RecommendationRepository.save(recommendation);
    }
}
