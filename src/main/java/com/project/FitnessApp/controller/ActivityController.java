package com.project.FitnessApp.controller;

import com.project.FitnessApp.dto.ActivityRequestDto;
import com.project.FitnessApp.dto.ActivityResponseDTO;
import com.project.FitnessApp.entity.Activity;
import com.project.FitnessApp.service.ActivityService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    private final ActivityService activityService;

    @PostMapping
    public ResponseEntity<ActivityResponseDTO> trackActivity(@RequestBody ActivityRequestDto activityRequestDto) {

        return ResponseEntity.ok(activityService.trackActivity(activityRequestDto));
    }

    @GetMapping
    public ResponseEntity<List<Activity>> retriveActivity(@RequestParam String userId) {
        Optional<List<Activity>> activityOptional = activityService.getActivity(userId);
        if (activityOptional.isEmpty())
            throw new RuntimeException("activity Not found Exception");
            return ResponseEntity.ok(activityOptional.get());


    }

}
