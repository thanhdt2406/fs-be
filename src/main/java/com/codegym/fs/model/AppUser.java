package com.codegym.fs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 6,max = 32)
    @NotNull
    private String username;

    @Size(min = 6,max = 32)
    @NotNull
    private String password;

    private String email;

    @NotNull
    private String phoneNumber;

    @NotNull
    private String address;

    @ManyToOne
    private Ward ward;

    @ManyToOne
    private Role role;
}
