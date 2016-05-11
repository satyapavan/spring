package com.demo.spring_v2;

import java.util.List;

public class LunchBox {

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	List<Item> items;

	public void print(){
		System.out.println("		--------LUNCHBOX---------");
		for (Item item : items) {
			item.print();
		}
	}
}
