package com.codegym.fs.service.province;

import com.codegym.fs.model.Province;
import com.codegym.fs.repository.IProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProvinceServiceImpl implements IProvinceService{
    @Autowired
    private IProvinceRepository provinceRepository;

    @Override
    public Province save(Province province) {
        return provinceRepository.save(province);
    }

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Optional<Province> findById(Long id) {
        return provinceRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        provinceRepository.deleteById(id);
    }
}
