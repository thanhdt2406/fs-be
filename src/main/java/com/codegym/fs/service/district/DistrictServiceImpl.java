package com.codegym.fs.service.district;

import com.codegym.fs.model.District;
import com.codegym.fs.repository.IDistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DistrictServiceImpl implements IDistrictService{
    @Autowired
    private IDistrictRepository districtRepository;

    @Override
    public District save(District district) {
        return districtRepository.save(district);
    }

    @Override
    public Iterable<District> findAll() {
        return districtRepository.findAll();
    }

    @Override
    public Optional<District> findById(Long id) {
        return districtRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        districtRepository.deleteById(id);
    }
}
