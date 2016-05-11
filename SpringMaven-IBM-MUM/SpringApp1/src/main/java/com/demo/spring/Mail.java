package com.demo.spring;

public class Mail {
	String from;
	String to;
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

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
	
	public void doInit(){
		System.out.println(this.getClass().getName()+" is initialised...");
	}
	
	public void doDestroy(){
		System.out.println(this.getClass().getName()+" is destroyed...");
	}
}
