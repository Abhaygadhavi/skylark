package com.skylark.exceptions;

public class AirportNotFoundException extends Exception {
	private String message;

	public AirportNotFoundException(String message) {
		super(message);
	}
}
