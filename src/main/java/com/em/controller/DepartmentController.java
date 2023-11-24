package com.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.em.entity.Department;

import com.em.services.DepartmentService;


@RestController
@RequestMapping("/dep")
@CrossOrigin("*")
public class DepartmentController {
	
	
	 @Autowired
	 private DepartmentService departmentService;

    //add category
    @PostMapping("/add")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
        Department category1 = this.departmentService.addDepartment(department);
        return ResponseEntity.ok(category1);
    }

    //get category
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id) {
        return this.departmentService.getDepartmentById(id);
    }

    //get all categories
    @GetMapping("/all")
    public ResponseEntity<?> getCategories() {
        return ResponseEntity.ok(this.departmentService.getAllDepartment());
    }

    @PutMapping("/{id}")
	public ResponseEntity<Department> updateCategory(@PathVariable Long id,@RequestBody Department department)
	{
		
		Department updatedDepartment =departmentService.updateDepartment(id,department);
		if(updatedDepartment==null)
		{
			return ResponseEntity.notFound().build();
		}
		else
		{
			return ResponseEntity.ok(updatedDepartment);
		}
	}

    //delete category
    @DeleteMapping("/del/{id}")
    public void deleteCategory(@PathVariable("id") Long id) {
        this.departmentService.deleteDepartment(id);
    }

	

}
