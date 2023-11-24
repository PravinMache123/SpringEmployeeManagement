package com.em.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

//Salary.java
@Entity
public class Salary {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 
 @ManyToOne
 @JoinColumn(name = "employee_id")
 private Employee employee;

 private BigDecimal amount;
 private LocalDate startDate;
 private LocalDate endDate;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
public BigDecimal getAmount() {
	return amount;
}
public void setAmount(BigDecimal amount) {
	this.amount = amount;
}
public LocalDate getStartDate() {
	return startDate;
}
public void setStartDate(LocalDate startDate) {
	this.startDate = startDate;
}
public LocalDate getEndDate() {
	return endDate;
}
public void setEndDate(LocalDate endDate) {
	this.endDate = endDate;
}
public Salary(Long id, Employee employee, BigDecimal amount, LocalDate startDate, LocalDate endDate) {
	super();
	this.id = id;
	this.employee = employee;
	this.amount = amount;
	this.startDate = startDate;
	this.endDate = endDate;
}
public Salary() {
	super();
	// TODO Auto-generated constructor stub
}

 // Other fields, getters, and setters
 
}

