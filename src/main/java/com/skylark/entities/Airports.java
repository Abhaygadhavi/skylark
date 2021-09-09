/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 07-sept-2021
 * @copyright Skylark Airlines
 */
package com.skylark.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;

@Entity

public class Airports {

	@Id
	private String IATACode;
	
	@OneToMany(cascade = CascadeType.ALL)
	@NotNull
	@JoinColumn
	private List<Flight> flightId;
	private String airportName;
	private String airportState;
	private String airportCity;
	
	public Airports() {
		// TODO Auto-generated constructor stub
	}

	public Airports(String iATACode, List<Flight> flightId, String airportName, String airportState, String airportCity) {
		super();
		IATACode = iATACode;
		this.flightId = flightId;
		this.airportName = airportName;
		this.airportState = airportState;
		this.airportCity = airportCity;
	}

	public String getIATACode() {
		return IATACode;
	}

	public void setIATACode(String iATACode) {
		IATACode = iATACode;
	}

	public List<Flight> getFlightId() {
		return flightId;
	}

	public void setFlightId(List<Flight> flightId) {
		this.flightId = flightId;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAirportState() {
		return airportState;
	}

	public void setAirportState(String airportState) {
		this.airportState = airportState;
	}

	public String getAirportCity() {
		return airportCity;
	}

	public void setAirportCity(String airportCity) {
		this.airportCity = airportCity;
	}

	@Override
	public String toString() {
		return "Airports [IATACode=" + IATACode + ", flightId=" + flightId + ", airportName=" + airportName
				+ ", airportState=" + airportState + ", airportCity=" + airportCity + "]";
	}
	
}
