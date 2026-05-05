package com.project.FitnessApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class FitnessAppMonolithApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitnessAppMonolithApplication.class, args);
	}



}
