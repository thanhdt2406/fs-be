package com.codegym.fs.controller;

import com.codegym.fs.model.Ward;
import com.codegym.fs.service.ward.IWardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/wards")
public class WardController {
    @Autowired
    private IWardService wardService;

    @GetMapping
    public ResponseEntity<Iterable<Ward>> getAllWard(){
        return new ResponseEntity<>(wardService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Ward>> getWardById(@PathVariable("id") Long id){
        return new ResponseEntity<>(wardService.findById(id),HttpStatus.OK);
    }

    @GetMapping("/districts/{id}")
    public ResponseEntity<Iterable<Ward>> getWardByDistrictId(@PathVariable("id") Long id){
        return new ResponseEntity<>(wardService.findAllByDistrictId(id),HttpStatus.OK);
    }
}
