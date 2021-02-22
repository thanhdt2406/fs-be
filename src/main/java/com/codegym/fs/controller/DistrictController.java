package com.codegym.fs.controller;

import com.codegym.fs.model.District;
import com.codegym.fs.service.district.IDistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/districts")
public class DistrictController {
    @Autowired
    private IDistrictService districtService;

    @GetMapping
    public ResponseEntity<Iterable<District>> getAllDistrict(){
        return new ResponseEntity<>(districtService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<District>> getDistrictById(@PathVariable("id") Long id){
        return new ResponseEntity<>(districtService.findById(id),HttpStatus.OK);
    }

    @GetMapping("/provinces/{id}")
    public ResponseEntity<Iterable<District>> getDistrictByProvinceId(@PathVariable("id") Long id){
        return new ResponseEntity<>(districtService.findAllByProvinceId(id),HttpStatus.OK);
    }
}
