package com.codegym.fs.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPrinciple implements UserDetails {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    @JsonIgnore
    private String password;

    private String name;

    private String email;

    private String phoneNumber;

    private String address;

    private Ward ward;

    private Collection<? extends GrantedAuthority> authorities;

    public static UserPrinciple build(AppUser appUser) {
        List<GrantedAuthority> authorities = appUser.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());

        return new UserPrinciple(
                appUser.getId(),
                appUser.getUsername(),
                appUser.getPassword(),
                appUser.getName(),
                appUser.getEmail(),
                appUser.getPhoneNumber(),
                appUser.getAddress(),
                appUser.getWard(),
                authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        UserPrinciple user = (UserPrinciple) o;
        return Objects.equals(id, user.id);
    }
}
