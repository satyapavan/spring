package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		/*
		 * BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
		 * "D:\\workspace14\\SpringMaven-IBM-MUM\\SpringApp1\\src\\main\\resources\\context.xml"
		 * ));
		 */
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"context.xml","message-context.xml"});
		Mail mail = (Mail) ctx.getBean("com.demo.spring.Mail");
		System.out.println(mail.getMessage().getHeader());
		
		mail.getMessage().setHeader("when is the Lunch Break");
		
		Mail mail1 = (Mail) ctx.getBean("com.demo.spring.Mail");
		System.out.println(mail1.getMessage().getHeader());

	}

}
