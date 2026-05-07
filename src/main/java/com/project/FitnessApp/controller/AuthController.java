package com.project.FitnessApp.controller;


import com.project.FitnessApp.dto.UserRegisterDTO;
import com.project.FitnessApp.dto.UserResponseDTO;
import com.project.FitnessApp.entity.User;
import com.project.FitnessApp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private UserService userService;


    @PostMapping("/register")
    public ResponseEntity<UserResponseDTO> register(@RequestBody UserRegisterDTO userRegisterDTO)
    {
        return ResponseEntity.ok(userService.register(userRegisterDTO));
    }

    @GetMapping("/find")
    public UserResponseDTO findUser(@RequestParam String userId)
    {
    return  userService.find(userId);
    }

}
