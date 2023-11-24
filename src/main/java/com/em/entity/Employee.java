package com.em.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

//Employee.java
@Entity
public class Employee {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String firstName;
 private String lastName;
 private long age;
 private String email;
 private String password;
 
 @ManyToOne
 @JoinColumn(name = "department_id")
 private Department department;

 @ManyToOne
 @JoinColumn(name = "position_id")
 private Position position;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}

public Position getPosition() {
	return position;
}

public void setPosition(Position position) {
	this.position = position;
}



public Employee(Long id, String firstName, String lastName, long age, String email, String password,
		Department department, Position position) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.email = email;
	this.password = password;
	this.department = department;
	this.position = position;
}

public long getAge() {
	return age;
}

public void setAge(long age) {
	this.age = age;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


 // Other fields, getters, and setters
 
 
}



