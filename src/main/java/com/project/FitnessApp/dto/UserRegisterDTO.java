package com.project.FitnessApp.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class UserRegisterDTO {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
}
