package com.em.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.em.entity.Department;
import com.em.entity.Employee;

@Service
public interface DepartmentService {
	
	
	

	   public Department addDepartment(Department dept);
	   public Department getDepartmentById(Long id);
	   public List<Department>  getAllDepartment();
	   public void deleteDepartment(Long id);
	   public Department updateDepartment(Long id, Department dept);
	    // Other methods as needed
	}



