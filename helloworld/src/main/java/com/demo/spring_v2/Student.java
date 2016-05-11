package com.demo.spring_v2;

import java.util.List;

public class Student {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LunchBox getLunchbox() {
		return lunchbox;
	}
	public void setLunchbox(LunchBox lunchbox) {
		this.lunchbox = lunchbox;
	}
	private String name;
	private LunchBox lunchbox;

	public void print(){
		System.out.println("	--------STUDENT---------");
		System.out.println("	Name    :" +name);
		lunchbox.print();
	}
}
