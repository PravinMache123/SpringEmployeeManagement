package com.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.em.entity.Position;

import com.em.services.PositionService;

@RestController
@RequestMapping("/pos")
@CrossOrigin("*")
public class PositionController {
	
	 @Autowired
	 private PositionService positionService;

    //add category
    @PostMapping("/add")
    public ResponseEntity<Position> savePosition(@RequestBody Position position) {
        Position category1 = this.positionService.savePosition(position);
        return ResponseEntity.ok(category1);
    }

    //get category
    @GetMapping("/{id}")
    public Position getPositionById(@PathVariable("id") Long id) {
        return this.positionService.getPositionById(id);
    }

    //get all categories
    @GetMapping("/all")
    public ResponseEntity<?> getPosition() {
        return ResponseEntity.ok(this.positionService.getAllPositions());
    }

  

    //delete category
    @DeleteMapping("/del/{id}")
    public void deletePosition(@PathVariable("id") Long id) {
        this.positionService.deletePosition(id);
    }



}
