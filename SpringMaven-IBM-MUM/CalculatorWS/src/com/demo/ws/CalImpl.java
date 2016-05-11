package com.demo.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.demo.ws.Calculator")
public class CalImpl implements Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}
