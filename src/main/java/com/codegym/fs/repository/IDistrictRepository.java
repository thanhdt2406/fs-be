package com.codegym.fs.repository;

import com.codegym.fs.model.District;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDistrictRepository extends CrudRepository<District,Long> {
}
