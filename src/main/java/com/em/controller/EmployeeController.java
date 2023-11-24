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

import com.em.entity.Employee;
import com.em.services.EmployeeService;

	

	@RestController
	@RequestMapping("/emp")
	@CrossOrigin("*")
	public class EmployeeController {
		
		 @Autowired
		 private EmployeeService employeeService;

	    //add category
	    @PostMapping("/add")
	    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
	        Employee category1 = this.employeeService.addEmployee(employee);
	        return ResponseEntity.ok(category1);
	    }

	    //get category
	    @GetMapping("/{id}")
	    public Employee getEmployeeById(@PathVariable("id") Long id) {
	        return this.employeeService.getEmployeeById(id);
	    }

	    //get all categories
	    @GetMapping("/all")
	    public ResponseEntity<?> getEmployee() {
	        return ResponseEntity.ok(this.employeeService.getAllEmployees());
	    }

	    @PutMapping("/{id}") 
		public ResponseEntity<Employee> updateCategory(@PathVariable Long id,@RequestBody Employee employee)
		{
			
			Employee updatedEmployee =employeeService.updateEmployee(id,employee);
			if(updatedEmployee==null)
			{
				return ResponseEntity.notFound().build();
			}
			else
			{
				return ResponseEntity.ok(updatedEmployee);
			}
		}

	    //delete category
	    @DeleteMapping("/del/{id}")
	    public void deleteCategory(@PathVariable("id") Long id) {
	        this.employeeService.deleteEmployee(id);
	    }


	}


