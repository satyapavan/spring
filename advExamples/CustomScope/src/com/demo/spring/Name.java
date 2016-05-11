package com.demo.spring;

public class Name {
	String firstName;
	String lastName;
public Name() {
	System.out.println("Name() Constructor ......");
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

}
