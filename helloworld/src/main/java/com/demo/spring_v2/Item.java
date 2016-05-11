package com.demo.spring_v2;

public class Item {
	private String name;
	private String taste;

	public Item() {

	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}

	public void print(){
		System.out.println("			--------ITEM---------");
		System.out.println("			Name    :" +name);
		System.out.println("			Taste   :" +taste);
	}

}
