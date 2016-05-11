package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;

public class Client {

	public static void main(String[] args) {

		Authentication auth = new UsernamePasswordAuthenticationToken(
				"shantanu", "12345678");
		SecurityContext sctx = new SecurityContextImpl();
		sctx.setAuthentication(auth);
		SecurityContextHolder.setContext(sctx);
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[] { "context.xml", "message-context.xml" });
		Mail mail = (Mail) ctx.getBean("com.demo.spring.Mail");
		System.out.println(mail.getMessage().getHeader());

		mail.getMessage().setHeader("when is the Lunch Break");

		Mail mail1 = (Mail) ctx.getBean("com.demo.spring.Mail");
		System.out.println(mail1.getMessage().getHeader());

	}

}
