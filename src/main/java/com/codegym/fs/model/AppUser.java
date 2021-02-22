package com.codegym.fs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

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

    @NotNull
    private String password;

    @NotNull
    private String name = "Anonymous";

    private String email;

    @NotNull
    private String phoneNumber;

    @NotNull
    private String address;

    @ManyToOne
    private Ward ward;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;

    public AppUser(@Size(min = 6, max = 32) @NotNull String username, @Size(min = 6, max = 32) @NotNull String password) {
        this.username = username;
        this.password = password;
    }

    public AppUser(@Size(min = 6, max = 32) @NotNull String username, @NotNull String password, @NotNull String name, @NotNull String phoneNumber, @NotNull String address) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
