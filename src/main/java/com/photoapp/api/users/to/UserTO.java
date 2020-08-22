package com.photoapp.api.users.to;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserTO implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	@Size(min = 3 , message = "First name must have at least 3 characters")
	private String firstName;
	
	@NotNull
	@Size(min = 3 , message = "Last name must have at least 3 characters")
	private String lastName;
	
	@NotNull
	private String password;
	
	@NotNull
	@Email
	private String email;
	
	private String userId;
	
	private String encryptedPassword;
	
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
	
	
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	@Override
	public String toString() {
		return "UserTO [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + ", email="
				+ email + "]";
	}
	
	
	
	
	
}
