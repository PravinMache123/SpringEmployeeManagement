package com.em.services;

import org.springframework.stereotype.Service;

import com.em.entity.Admin;

@Service
public interface AdminService {
	
	public Admin findByUsername(String username);

}