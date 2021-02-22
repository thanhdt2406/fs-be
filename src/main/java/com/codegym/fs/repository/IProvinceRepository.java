package com.codegym.fs.repository;

import com.codegym.fs.model.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProvinceRepository extends CrudRepository<Province,Long> {
}
