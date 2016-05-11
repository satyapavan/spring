package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	int empId;
	Name name;
	Address address;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Autowired
	public void inject(Address address, Name name/*,String blah*/) {
		System.out.println("Inject method is called.. surprised!");
		this.address = address;
		this.name = name;
	}
}
