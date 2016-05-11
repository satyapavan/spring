package com.demo.spring_v2;

import java.util.List;

public class Trainer {
	private String name;
	private List<Student> students;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void print(){
		System.out.println("--------TRAINER---------");
		System.out.println("Name    :" +name);
		for (Student student : students) {
			student.print();	
		}

	}
}
