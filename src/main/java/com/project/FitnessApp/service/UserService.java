package com.project.FitnessApp.service;

import com.project.FitnessApp.dto.UserRegisterDTO;
import com.project.FitnessApp.dto.UserResponseDTO;
import com.project.FitnessApp.entity.User;
import com.project.FitnessApp.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public UserResponseDTO register(UserRegisterDTO userDto) {

        User user=User.builder().email(userDto.getEmail()).lastName(userDto.getLastName()).password(userDto.getPassword())
                .firstName(userDto.getFirstName()).activities(List.of()).recomendations(List.of())
                .build();
        user= userRepository.save(user);
        return UserResponseDTO.builder().id(user.getId()).email(user.getEmail()).firstName(user.getFirstName()).lastName(user.getLastName())
                .password(user.getPassword()).createdAt(user.getCreatedAt()).updatedAt(user.getUpdatedAt()).build();
    }
}
