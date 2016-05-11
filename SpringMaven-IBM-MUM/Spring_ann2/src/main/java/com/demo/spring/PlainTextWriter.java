package com.demo.spring;

import org.springframework.stereotype.Component;

//@Component
public class PlainTextWriter implements IWriter {

	public String write(String message) {

		return "Plain Text Writer wrote : " + message;
	}

}
