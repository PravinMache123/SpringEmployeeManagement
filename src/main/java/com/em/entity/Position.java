package com.em.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

//Position.java
@Entity
public class Position {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String name;

 @OneToMany(mappedBy = "position")
 private List<Employee> employees;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Employee> getEmployees() {
	return employees;
}

public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}

public Position(Long id, String name, List<Employee> employees) {
	super();
	this.id = id;
	this.name = name;
	this.employees = employees;
}

public Position() {
	super();
	// TODO Auto-generated constructor stub
}

 // Other fields, getters, and setters
 
}
