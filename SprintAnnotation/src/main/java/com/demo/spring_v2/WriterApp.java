package com.demo.spring_v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WriterApp {
	
	@Autowired
	//@Qualifier("ClearText")
	IWriter writer;
	
	public void print(String message){
		writer.writeMessage(message);
	}
}
