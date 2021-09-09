/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 07-sept-2021
 * @copyright Skylark Airlines
 */
package com.skylark.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.sun.istack.NotNull;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(generator = "increment")
	private String PNR;
	
	@OneToOne(cascade = CascadeType.ALL)
	@NotNull
	@JoinColumn
	private Flight flightId;
	
	@OneToMany(cascade = CascadeType.ALL)
	@NotNull
	private List<Passenger> psId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@NotNull
	@JoinColumn
	private Booking bookingId;
	
	public Ticket() {
		// TODO Auto-generated constructor stub
	}

	public Ticket(String pNR, Flight flightId, List<Passenger> psId, Booking bookingId) {
		super();
		PNR = pNR;
		this.flightId = flightId;
		this.psId = psId;
		this.bookingId = bookingId;
	}

	public String getPNR() {
		return PNR;
	}

	public void setPNR(String pNR) {
		PNR = pNR;
	}

	public Flight getFlightId() {
		return flightId;
	}

	public void setFlightId(Flight flightId) {
		this.flightId = flightId;
	}

	public List<Passenger> getPsId() {
		return psId;
	}

	public void setPsId(List<Passenger> psId) {
		this.psId = psId;
	}

	public Booking getBookingId() {
		return bookingId;
	}

	public void setBookingId(Booking bookingId) {
		this.bookingId = bookingId;
	}

	@Override
	public String toString() {
		return "Ticket [PNR=" + PNR + ", flightId=" + flightId + ", psId=" + psId + ", bookingId=" + bookingId + "]";
	}
	
}
