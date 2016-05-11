package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");
		WriterApp app = (WriterApp) ctx.getBean("writerApp");
		app.print("Hello Spring annotation");

	}

}
