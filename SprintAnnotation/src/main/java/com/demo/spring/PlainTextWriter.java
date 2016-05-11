package com.demo.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PlainText")
public class PlainTextWriter implements IWriter {

	@Override
	public void writeMessage(String s) {
		System.out.println("Plain Text Writer!" + s);

	}

}
