package com.codegym.fs.service.role;

import com.codegym.fs.model.Role;
import com.codegym.fs.service.IGeneralService;

import java.util.Optional;

public interface IRoleService extends IGeneralService<Role> {
    Optional<Role> findByName(String name);
}
