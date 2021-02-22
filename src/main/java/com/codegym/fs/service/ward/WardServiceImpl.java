package com.codegym.fs.service.ward;

import com.codegym.fs.model.Ward;
import com.codegym.fs.repository.IWardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WardServiceImpl implements IWardService{
    @Autowired
    private IWardRepository wardRepository;

    @Override
    public Ward save(Ward ward) {
        return wardRepository.save(ward);
    }

    @Override
    public Iterable<Ward> findAll() {
        return wardRepository.findAll();
    }

    @Override
    public Optional<Ward> findById(Long id) {
        return wardRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        wardRepository.deleteById(id);
    }

    @Override
    public Iterable<Ward> findAllByDistrictId(Long id) {
        return wardRepository.findAllByDistrict_Id(id);
    }
}
