package com.codegym.fs.repository;

import com.codegym.fs.model.Ward;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWardRepository extends CrudRepository<Ward,Long> {
}
