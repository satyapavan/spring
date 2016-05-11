package com.demo.spring_v2;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        
        List<Trainer> tList = new ArrayList<Trainer>();
        
        Trainer t = (Trainer) ctx.getBean("t1");
        tList.add(t);
        t = (Trainer) ctx.getBean("t2");
        tList.add(t);
        
        for (Trainer trainer : tList) {
			trainer.print();
		}
        
    }
}
