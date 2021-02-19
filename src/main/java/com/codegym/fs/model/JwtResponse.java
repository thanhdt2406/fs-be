package com.codegym.fs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtResponse {
    private Long id;

    private String username;

    private String password;

    private String name;

    private String email;

    private String phoneNumber;

    private String address;

    private Ward ward;

    private List<String> roles;

    private String token;

    private String type = "Bearer";

    public JwtResponse(String token, String username) {
        this.token = token;
        this.username = username;
    }

    public JwtResponse(Long id, String username, String password, String name, String email, String phoneNumber, String address, Ward ward, List<String> roles, String token) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.ward = ward;
        this.roles = roles;
        this.token = token;
    }
}
