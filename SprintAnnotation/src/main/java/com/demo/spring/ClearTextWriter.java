package com.demo.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ClearText")
public class ClearTextWriter implements IWriter {

	@Override
	public void writeMessage(String s) {
		System.out.println("Clear Text Writer!" + s);

	}

}
