package com.em.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.em.entity.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Long>{

}
