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


import com.em.entity.Salary;

import com.em.services.SalaryService;

@RestController
@RequestMapping("/sal")
@CrossOrigin("*")
public class SalaryController {
	
	 @Autowired
	 private SalaryService salaryService;

    //add category
    @PostMapping("/add")
    public ResponseEntity<Salary> saveSalary(@RequestBody Salary salary) {
        Salary category1 = this.salaryService.saveSalary(salary);
        return ResponseEntity.ok(category1);
    }

    //get category
    @GetMapping("/{id}")
    public Salary getSalaryById(@PathVariable("id") Long id) {
        return this.salaryService.getSalaryById(id);
    }

    //get all categories
    @GetMapping("/all")
    public ResponseEntity<?> getAllSalary() {
        return ResponseEntity.ok(this.salaryService.getAllSalaries());
    }

  

    //delete category
    @DeleteMapping("/del/{id}")
    public void deleteSalary(@PathVariable("id") Long id) {
        this.salaryService.deleteSalary(id);
    }


}
