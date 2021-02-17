package com.hcl.security.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="user_table")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int UserID;
	@NotNull
	@Size(min = 2, max = 25)
	@Pattern(regexp="^[a-zA-Z0-9]*$",
		message = "Username must contain only letters and numbers")
	private String username;
	@NotNull
	@Size(min = 8, max = 15)
	@Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z\\d]{8,15}$",
		message = "Password must contain at least an uppercase, a lowercase, and a number")
	private String password;
	@NotNull
	@Size(min = 2, max = 25)
	@Pattern(regexp="^[a-zA-Z0-9]+\\@[a-zA-Z0-9]+\\.[a-zA-Z]+$",
		message = "Please enter a valid email address")
	private String email;
	@NotNull
	private String role;
	
	public User() {}
	
	public User(int userID, String username, String password, String email, String role) {
		super();
		UserID = userID;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
