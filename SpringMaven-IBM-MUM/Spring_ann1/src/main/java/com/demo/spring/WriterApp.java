package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class WriterApp {

	@Autowired
	@Qualifier("niceWriter")
	IWriter writer;

	public void print(String s) {
		System.out.println(writer.write(s));
	}
}
