package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class Mail {
	String from;
	String to;
	
	@Autowired
	Message message;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Cacheable(value="demo")
	public Message getMessage() {
		System.out.println("Getting message.....");
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public void doInit() {
		System.out.println(this.getClass().getName() + " is initialised...");
	}

	public void doDestroy() {
		System.out.println(this.getClass().getName() + " is destroyed...");
	}
}
