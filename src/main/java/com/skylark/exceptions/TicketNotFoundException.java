package com.skylark.exceptions;

public class TicketNotFoundException extends Exception {

	private String message;

	public TicketNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "TicketNotFoundException [message=" + message + "]";
	}
	
	
}
