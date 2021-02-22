package com.codegym.fs.controller;

import com.codegym.fs.model.Province;
import com.codegym.fs.service.province.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/provinces")
public class ProvinceController {
    @Autowired
    private IProvinceService provinceService;

    @GetMapping
    public ResponseEntity<Iterable<Province>> getAllProvince(){
        return new ResponseEntity<>(provinceService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Province>> getProvinceById(@PathVariable("id") Long id){
        return new ResponseEntity<>(provinceService.findById(id),HttpStatus.OK);
    }
}
