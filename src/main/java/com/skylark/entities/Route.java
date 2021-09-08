package com.skylark.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Route {
	@Id
	@GeneratedValue(generator = "increment")
	private int routeId;
	private String fromCity;
	private String toCity;
	private int fare;
	
	public Route() {
		// TODO Auto-generated constructor stub
	}

	public Route(int routeId, String fromCity, String toCity, int fare) {
		super();
		this.routeId = routeId;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.fare = fare;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", fromCity=" + fromCity + ", toCity=" + toCity + ", fare=" + fare + "]";
	}
	
	
	
}
