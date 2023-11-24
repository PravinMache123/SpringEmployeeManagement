package com.em.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.em.entity.Salary;
@Service
public interface SalaryService {
	
	
	
	    Salary saveSalary(Salary salary);
	    Salary getSalaryById(Long id);
	    List<Salary> getAllSalaries();
	    void deleteSalary(Long id);
	    // Other methods as needed
	}



