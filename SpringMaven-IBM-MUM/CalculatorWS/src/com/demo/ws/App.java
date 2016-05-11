package com.demo.ws;

import javax.xml.ws.Endpoint;

public class App {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8181/Cal/calsevice", new CalImpl());

	}

}
