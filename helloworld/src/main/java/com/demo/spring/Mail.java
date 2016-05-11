package com.demo.spring;

import org.springframework.beans.factory.BeanNameAware;

public class Mail implements BeanNameAware {
	private String to;
	private String from;
	private Message message;
	
	public Mail() {
	}

	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("Name of the Bean is:" + arg0);
		
	}


}
