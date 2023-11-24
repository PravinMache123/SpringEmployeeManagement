package com.em.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.em.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
