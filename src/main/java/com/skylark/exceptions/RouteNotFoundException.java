package com.skylark.exceptions;
/*
 * @author mansi.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Sterlite technologies Ltd.
 */

public class RouteNotFoundException extends Exception {
	
	private String message;

	public RouteNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "RouteNotFoundException [message=" + message + "]";
	}
	
	

}
