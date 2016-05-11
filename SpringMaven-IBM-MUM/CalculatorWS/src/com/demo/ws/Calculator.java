package com.demo.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Calculator {
	@WebMethod
	public int add(int a, int b);
}
