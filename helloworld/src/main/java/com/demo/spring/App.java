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
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        
        Mail mail = (Mail) ctx.getBean("mail");
        
        System.out.println(mail.getMessage().getMessage());     
        System.out.println(mail.getMessage().getSubject());
        
        Message message = mail.getMessage();
        
        System.out.println(message.getMessage());     
        System.out.println(message.getSubject());
        
    }
}
