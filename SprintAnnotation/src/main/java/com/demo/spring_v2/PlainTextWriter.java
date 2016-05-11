package com.demo.spring_v2;

import org.springframework.stereotype.Component;

//@Component
public class PlainTextWriter implements IWriter {

	@Override
	public void writeMessage(String s) {
		System.out.println("Plain Text Writer!" + s);

	}

}
