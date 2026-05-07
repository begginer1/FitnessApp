package com.project.FitnessApp.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RecommendationRequest {

    private List<String> improvements;
    private List<String> suggestions;
    private List<String> safety;
    private String userId;
    private String activityId;
}
