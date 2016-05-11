package com.demo.spring;

public class Message {

	private String message;
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Message() {
	}

	public Message(String subject, String message) {
		this.message = message;
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void doInit(){
		System.out.println("Inside doInit");
	}

}
