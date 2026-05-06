package com.project.FitnessApp.controller;


import com.project.FitnessApp.dto.UserRegisterDTO;
import com.project.FitnessApp.dto.UserResponseDTO;
import com.project.FitnessApp.entity.User;
import com.project.FitnessApp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private UserService userService;


    @PostMapping("/register")
    public UserResponseDTO register(@RequestBody UserRegisterDTO userRegisterDTO)
    {
        return userService.register(userRegisterDTO);
    }

}
