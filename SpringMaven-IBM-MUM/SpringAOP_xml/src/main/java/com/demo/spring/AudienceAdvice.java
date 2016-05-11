package com.demo.spring;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class AudienceAdvice implements MethodBeforeAdvice, AfterReturningAdvice {

	Audience audience;

	public void setAudience(Audience audience) {
		this.audience = audience;
	}

	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		audience.applaud();

	}

	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		audience.takeSeat();
		audience.switchOffPhones();

	}

}
