package com.project.FitnessApp.dto;

import com.project.FitnessApp.entity.ActivityType;
import com.project.FitnessApp.entity.Recommendation;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActivityRequestDto {
    private Integer caloriesBurned;
    private Integer duration;
    private ActivityType type;
    private Map<String, Object> additionalMetrics;
    private String userId;
    private LocalDateTime startTime;
    private List<Recommendation> recommendations = new ArrayList<>();
}
