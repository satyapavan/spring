package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("context.xml");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);

		Mail mail = (Mail) ctx.getBean("mail");
		// System.out.println(mail.getMessage().getHeader());
		mail.getMessage();
		mail.getMessage();
		mail.getMessage();
		mail.getMessage();
		mail.getMessage();

	}

}
