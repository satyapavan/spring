package com.demo.spring;

public abstract class Mail {
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

	public String processMessage() {
		Message msg = createMessage();
		System.out.println(msg.hashCode());
		return msg.getBody();
	}

	public abstract Message createMessage();
}
