package com.em.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.em.entity.Employee;
import com.em.repo.EmployeeRepository;
import com.em.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	 @Autowired
	    private EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return this.employeeRepository.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return this.employeeRepository.findAll();
		
	}

	@Override
	public void deleteEmployee(Long id) {
		this.employeeRepository.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(id);
		if(optionalEmployee.isPresent())
		{
			Employee existingEmployee =  optionalEmployee.get();
			existingEmployee.setFirstName(employee.getFirstName());
			
			existingEmployee.setLastName(employee.getLastName());
			existingEmployee.setEmail(employee.getEmail());
			
			return employeeRepository.save(existingEmployee);
		}
		return null;
	}
	}
	


