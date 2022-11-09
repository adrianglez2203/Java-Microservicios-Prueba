package com.example.demo.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.tool.schema.extract.internal.SequenceNameExtractorImpl;
@Entity
@Table
public class User {
	@Id
	@SequenceGenerator(
			name = "user_sequence",
			sequenceName ="user_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "user_sequence"
	)
	private Long id;
	private String name;
	private String email;
	private String password;
	
	public User(String name, String email, String password) {

		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public User(Long id, String name, String email, String password) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public User() {
	
	}

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
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
