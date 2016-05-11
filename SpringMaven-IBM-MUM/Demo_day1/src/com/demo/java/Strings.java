package com.demo.java;

public class Strings {

	public static void main(String[] args) {
	
		String s1="Shantanu";
		String s2="Shantanu";
		System.out.println(s1==s2);
		String s3= new String("Shantanu");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.charAt(4));
		System.out.println(String.format("my name is %s", "James Bond"));

	}

}
