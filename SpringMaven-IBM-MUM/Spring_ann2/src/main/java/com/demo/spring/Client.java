package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		WriterApp app = (WriterApp) ctx.getBean(WriterApp.class);
		app.print("Hello Spring annotation");

	}

}
