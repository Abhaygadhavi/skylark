package com.skylark.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	private String username;
	private int flightId;
	private String password;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(String username, int flightId, String password) {
		super();
		this.username = username;
		this.flightId = flightId;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [username=" + username + ", flightId=" + flightId + ", password=" + password + "]";
	}
	
	
	
}
