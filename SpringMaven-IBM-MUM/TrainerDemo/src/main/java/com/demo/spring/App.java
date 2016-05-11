package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");
		Trainer tr = (Trainer) ctx.getBean("tr");
		System.out.println(tr.getParticipants().get(0).getLunchBox().getItems()
				.get(0).getName());
    }
}
