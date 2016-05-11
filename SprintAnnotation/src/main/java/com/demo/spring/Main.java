package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\training\\workspace\\SprintAnnotation\\src\\main\\resources\\context.xml");
		
		WriterApp app = (WriterApp) ctx.getBean("writerApp");
		app.print("I am going to get Spring");

	}
}
