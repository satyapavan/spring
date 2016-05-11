package com.demo.java;

public class DemoEx {
	public static void main(String[] args) {
		try {
			int a = 20;
			int b = 0;
			double d = a / b;
			int[] data = new int[4];
			data[0] = 1;
			data[5] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception is : " + e);
		} catch (Exception e) {
			System.out.println("Exception is : " + e);
		}
		System.out.println("can you see me?");
	}
}
