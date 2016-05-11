package com.demo.spring;

import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotEmpty(message = "Name cannot be empty")
	String name;
	@NotEmpty(message = "Name cannot be empty")
	@ValidEmail(message="This email is invalid")
	String email;
	@NotEmpty(message = "Name cannot be empty")
	String phone;
	@NotEmpty(message = "Name cannot be empty")
	String address;

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
