package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args)  throws Exception{
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");
		Performer singer = (Performer) ctx.getBean("target");
		singer.perform();
	}
}
