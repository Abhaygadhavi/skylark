package com.skylark.exceptions;

public class CreditDebitNotFoundException extends Exception {

	private String message;

	public CreditDebitNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "CreditDebitNotFoundException [message=" + message + "]";
	}
}
