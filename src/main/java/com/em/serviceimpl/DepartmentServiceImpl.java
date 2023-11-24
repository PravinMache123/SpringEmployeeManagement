package com.em.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.em.entity.Department;

import com.em.repo.DepartmentRepository;

import com.em.services.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService{
	 @Autowired
	    private DepartmentRepository departmentRepository;

	

	@Override
	public Department getDepartmentById(Long id) {
		return this.departmentRepository.findById(id).get();
	}

	@Override
	public List<Department> getAllDepartment() {
		return this.departmentRepository.findAll();
	}

	@Override
	public void deleteDepartment(Long id) {
		this.departmentRepository.deleteById(id);
		
	}

	@Override
	public Department updateDepartment(Long id, Department dept) {
		Optional<Department> optionalDepartment = departmentRepository.findById(id);
		if(optionalDepartment.isPresent())
		{
			Department existingDepartment =  optionalDepartment.get();
			existingDepartment.setName(dept.getName());
			
			
			
			return departmentRepository.save(existingDepartment);
		}
		return null;
	}

	@Override
	public Department addDepartment(Department dept) {
		return this.departmentRepository.save(dept);
	}
	}

	


