package com.em.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.em.entity.Employee;

@Service
public interface EmployeeService {
	
	   public Employee addEmployee(Employee employee);
	   public Employee getEmployeeById(Long id);
	   public List<Employee> getAllEmployees();
	   public void deleteEmployee(Long id);
	   public Employee updateEmployee(Long id, Employee employee);
	    // Other methods as needed
	}


