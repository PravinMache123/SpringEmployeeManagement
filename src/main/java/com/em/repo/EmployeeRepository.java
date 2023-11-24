package com.em.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.em.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
