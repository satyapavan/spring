package com.demo.java;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");

		for(String x:list){
			System.out.println(x);
		}
	}

}
