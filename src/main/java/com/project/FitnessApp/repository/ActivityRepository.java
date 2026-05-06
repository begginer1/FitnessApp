package com.project.FitnessApp.repository;

import com.project.FitnessApp.entity.Activity;
import com.project.FitnessApp.entity.Recomendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, String> {
}
