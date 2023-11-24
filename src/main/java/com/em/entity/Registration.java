package com.em.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Registration {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	    private int id;
	    private String firstName;
	    private String lastName;
	    private String gender;
	    private int age;
	    private String email;
	    private String password;
		public int getId() {
			return id;
		}
		public void setId(int id) {
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
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Registration(int id, String firstName, String lastName, String gender, int age, String email,
				String password) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.age = age;
			this.email = email;
			this.password = password;
		}
		public Registration() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    

	    
	}



