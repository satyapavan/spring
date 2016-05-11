package com.demo.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {
	/*@Pointcut("execution(* com..spring.Singer.perform(..))")
	public void pcut() {
	}*/

	@Before("execution(* com..spring.Singer.perform(..))")
	public void switchOffPhones() {
		System.out.println("Audience Switched off phones");
	}

	@AfterReturning("execution(* com..spring.Singer.perform(..))")
	public void applaud() {
		System.out.println("Audience : Clap Clap Clap");
	}

	@Before("execution(* com..spring.Singer.perform(..))")
	public void takeSeat() {
		System.out.println("Audience :takes their seats");
	}
	
	@AfterThrowing(throwing="e",pointcut="execution(* com..spring.Singer.perform(..))")
	public void afterThrowing(PerformerException e){
		System.out.println("We want refund!.....");
	}
	
	@After("execution(* com..spring.Singer.perform(..))")
	public void iamthereAlways(){
		System.out.println("Hello you are in After Advice..");
	}
}
