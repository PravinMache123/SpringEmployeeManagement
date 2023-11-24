package com.em.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

//Department.java
@Entity
public class Department {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String name;

 @OneToMany(cascade =CascadeType.ALL, mappedBy = "department")
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

public Department(Long id, String name, List<Employee> employees) {
	super();
	this.id = id;
	this.name = name;
	this.employees = employees;
}

public Department() {
	super();
	// TODO Auto-generated constructor stub
}
 

 // Other fields, getters, and setters
}

