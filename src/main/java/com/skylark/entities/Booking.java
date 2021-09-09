/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 07-sept-2021
 * @copyright Skylark Airlines
 */
package com.skylark.entities;

import java.time.LocalDate;
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
public class Booking {

	@Id
	@GeneratedValue(generator = "increment")
	private int bookingId;

	@OneToOne(cascade = CascadeType.ALL)
	@NotNull
	@JoinColumn
	private Flight flightId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@NotNull
	@JoinColumn
	private Payment paymentId;
	
	@OneToMany(cascade = CascadeType.ALL)
	@NotNull
	private List<Passenger> psId;
	
	private LocalDate bookingDate;
	private float bookingTotalFare;
	private LocalDate bookingJourneyDate;
	private String bookingSeatType;
	private String bookingStatus;
	private int numberOfSeats;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Booking(int bookingId, Flight flightId, Payment paymentId, List<Passenger> psId, LocalDate bookingDate,
			float bookingTotalFare, LocalDate bookingJourneyDate, String bookingSeatType, String bookingStatus,
			int numberOfSeats) {
		super();
		this.bookingId = bookingId;
		this.flightId = flightId;
		this.paymentId = paymentId;
		this.psId = psId;
		this.bookingDate = bookingDate;
		this.bookingTotalFare = bookingTotalFare;
		this.bookingJourneyDate = bookingJourneyDate;
		this.bookingSeatType = bookingSeatType;
		this.bookingStatus = bookingStatus;
		this.numberOfSeats = numberOfSeats;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Flight getFlightId() {
		return flightId;
	}

	public void setFlightId(Flight flightId) {
		this.flightId = flightId;
	}

	public Payment getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Payment paymentId) {
		this.paymentId = paymentId;
	}

	public List<Passenger> getPsId() {
		return psId;
	}

	public void setPsId(List<Passenger> psId) {
		this.psId = psId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public float getBookingTotalFare() {
		return bookingTotalFare;
	}

	public void setBookingTotalFare(float bookingTotalFare) {
		this.bookingTotalFare = bookingTotalFare;
	}

	public LocalDate getBookingJourneyDate() {
		return bookingJourneyDate;
	}

	public void setBookingJourneyDate(LocalDate bookingJourneyDate) {
		this.bookingJourneyDate = bookingJourneyDate;
	}

	public String getBookingSeatType() {
		return bookingSeatType;
	}

	public void setBookingSeatType(String bookingSeatType) {
		this.bookingSeatType = bookingSeatType;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", flightId=" + flightId + ", paymentId=" + paymentId + ", psId="
				+ psId + ", bookingDate=" + bookingDate + ", bookingTotalFare=" + bookingTotalFare
				+ ", bookingJourneyDate=" + bookingJourneyDate + ", bookingSeatType=" + bookingSeatType
				+ ", bookingStatus=" + bookingStatus + ", numberOfSeats=" + numberOfSeats + "]";
	}
	
	
	
}
