package com.em.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.em.entity.Admin;



public interface AdminRepository extends JpaRepository<Admin, Long> {
	
	public Admin findByUsername(String username);

}
