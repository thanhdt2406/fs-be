package com.codegym.fs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {
    private String username;

    private String password;

    private String name;

    private String phoneNumber;

    private String address;

    private Long ward;

    private String email;

    private Set<String> roles;
}
