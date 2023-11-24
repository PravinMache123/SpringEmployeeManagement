package com.em.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.em.entity.Admin;
import com.em.repo.AdminRepository;
import com.em.services.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin findByUsername(String username) {
		
		return this.adminRepository.findByUsername(username);
	}

}