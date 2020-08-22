package com.photoapp.api.users.to;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserTO {

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
	@Override
	public String toString() {
		return "UserTO [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + ", email="
				+ email + "]";
	}
	
	
	
	
	
}