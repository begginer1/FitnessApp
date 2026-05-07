package com.project.FitnessApp.controller;

import com.project.FitnessApp.dto.RecommendationRequest;
import com.project.FitnessApp.entity.Recommendation;

import com.project.FitnessApp.service.RecommendationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recommendation")
public class RecommendationController {

    private final RecommendationService recommendationService;


    public RecommendationController(RecommendationService recommendationService)
    {
        this.recommendationService=recommendationService;
    }
    @PostMapping("/generate")
    public ResponseEntity<Recommendation> generateRecommendation(@RequestBody RecommendationRequest request)
    {
        Recommendation recommendation =recommendationService.generateRecommendation(request);
        return ResponseEntity.ok(recommendation);
    }

    @GetMapping("/user")
    public Recommendation getRecomendation(@RequestBody Integer userId)
    {
        return null;
    }


}
