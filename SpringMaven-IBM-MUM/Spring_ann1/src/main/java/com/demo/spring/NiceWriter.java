package com.demo.spring;

import org.springframework.stereotype.Component;


@Component()
public class NiceWriter implements IWriter {

	public String write(String message) {

		return "Nice Writer wrote : " + message;
	}

}
