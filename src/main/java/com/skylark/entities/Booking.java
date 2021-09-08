package com.skylark.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {

	@Id
	private int bookingId;
	private int flightId;
	private int routeId;
	private int paymentId;
	private String psId;
	private LocalDate bookingDate;
	private int bookingTotalFare;
	private LocalDate bookingJourneyDate;
	private String bookingSeatType;
	private String bookingStatus;
	private int numberOfSeats;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Booking(int bookingId, int flightId, int routeId, int paymentId, String psId, LocalDate bookingDate,
			int bookingTotalFare, LocalDate bookingJourneyDate, String bookingSeatType, String bookingStatus,
			int numberOfSeats) {
		super();
		this.bookingId = bookingId;
		this.flightId = flightId;
		this.routeId = routeId;
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

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getPsId() {
		return psId;
	}

	public void setPsId(String psId) {
		this.psId = psId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getBookingTotalFare() {
		return bookingTotalFare;
	}

	public void setBookingTotalFare(int bookingTotalFare) {
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
		return "Booking [bookingId=" + bookingId + ", flightId=" + flightId + ", routeId=" + routeId + ", paymentId="
				+ paymentId + ", psId=" + psId + ", bookingDate=" + bookingDate + ", bookingTotalFare="
				+ bookingTotalFare + ", bookingJourneyDate=" + bookingJourneyDate + ", bookingSeatType="
				+ bookingSeatType + ", bookingStatus=" + bookingStatus + ", numberOfSeats=" + numberOfSeats + "]";
	}
	
	
	
	
}
