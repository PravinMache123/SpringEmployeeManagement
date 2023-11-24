package com.em.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.em.entity.Salary;
import com.em.repo.SalaryRepository;
import com.em.services.SalaryService;

@Service
public class SalaryServiceImpl implements SalaryService {
    
	@Autowired 
	private SalaryRepository salaryRepository;
	@Override
	public Salary saveSalary(Salary salary) {
		
		return this.salaryRepository.save(salary);
	}

	@Override
	public Salary getSalaryById(Long id) {
		
		return this.salaryRepository.findById(id).get();
	}

	@Override
	public List<Salary> getAllSalaries() {
		
		return this.salaryRepository.findAll();
	}

	@Override
	public void deleteSalary(Long id) {
		this.deleteSalary(id);
		
	}

}
