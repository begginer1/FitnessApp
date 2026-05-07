package com.project.FitnessApp.dto;

import com.project.FitnessApp.entity.ActivityType;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Map;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActivityResponseDTO {
    private String id;
    private Integer caloriesBurned;
    private Integer duration;
    private ActivityType type;
    private LocalDateTime createdAt;
    private LocalDateTime startTime;
    private LocalDateTime updatedAt;
    private Map<String, Object> additionalMetrics;
    private String userId;

}
