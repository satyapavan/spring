package com.demo.spring_v2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_V2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		//WriterApp app = (WriterApp) ctx.getBean("writerApp");
		
		WriterApp app = ctx.getBean(WriterApp.class);
		app.print("I am going to get Spring");
	}

}
