package com.codegym.fs.service.appuser;

import com.codegym.fs.model.AppUser;
import com.codegym.fs.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public interface IAppUserService extends IGeneralService<AppUser>, UserDetailsService {
    Optional<AppUser> findByUsername(String username) ;

    Boolean existsByUsername(String username);

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
