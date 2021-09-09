/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 07-sept-2021
 * @copyright Skylark Airlines
 */
package com.skylark.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ticket {
	@Id
	@GeneratedValue(generator = "increment")
	private String PNR;
	private int flightId;
	private String psId;
	private int bookingId;
	
	public Ticket() {
		// TODO Auto-generated constructor stub
	}

	public Ticket(String pNR, int flightId, String psId, int bookingId) {
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

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getPsId() {
		return psId;
	}

	public void setPsId(String psId) {
		this.psId = psId;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	@Override
	public String toString() {
		return "Ticket [PNR=" + PNR + ", flightId=" + flightId + ", psId=" + psId + ", bookingId=" + bookingId + "]";
	}
	
	
	
}
