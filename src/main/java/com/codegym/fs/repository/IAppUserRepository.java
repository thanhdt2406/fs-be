package com.codegym.fs.repository;

import com.codegym.fs.model.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAppUserRepository extends CrudRepository<AppUser,Long> {
    Optional<AppUser> findByUsername(String username);

    Boolean existsByUsername(String username);
}
