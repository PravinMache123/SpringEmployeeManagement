package com.em.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.em.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}
