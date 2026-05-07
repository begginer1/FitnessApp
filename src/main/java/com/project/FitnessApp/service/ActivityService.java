package com.project.FitnessApp.service;

import com.project.FitnessApp.dto.ActivityRequestDto;
import com.project.FitnessApp.dto.ActivityResponseDTO;
import com.project.FitnessApp.entity.Activity;
import com.project.FitnessApp.entity.User;
import com.project.FitnessApp.repository.ActivityRepository;
import com.project.FitnessApp.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ActivityService {

    private final ActivityRepository activityRepository;
    private final UserRepository userRepository;




    @Transactional
    public ActivityResponseDTO trackActivity(ActivityRequestDto activityRequestDto) {
        User user = userRepository.findById(activityRequestDto.getUserId()).orElseThrow(() -> new RuntimeException("User Not found"));
        Activity activity = Activity.builder().recommendations(List.of()).type(activityRequestDto.getType())
                .additionalMetrics(activityRequestDto.getAdditionalMetrics())
                .startTime(activityRequestDto.getStartTime()).caloriesBurned(activityRequestDto.getCaloriesBurned())
                .duration(activityRequestDto.getDuration()).user(user)
                .build();
        Activity savedActivity = activityRepository.save(activity);
        return ActivityResponseDTO.builder()
                .id(savedActivity.getId())
                .caloriesBurned(savedActivity.getCaloriesBurned()).createdAt(savedActivity.getCreatedAt()).type(savedActivity.getType())
                .startTime(savedActivity.getStartTime()).updatedAt(savedActivity.getUpdatedAt())
                .userId(savedActivity.getUser().getId())
                .duration(savedActivity.getDuration()).additionalMetrics(savedActivity.getAdditionalMetrics()).build();
    }

    public Optional<List<Activity>> getActivity(String userId) {
        return Optional.ofNullable(activityRepository.findByUserId(userId));
        }
    }

