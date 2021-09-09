/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 07-sept-2021
 * @copyright Skylark Airlines
 */
package com.skylark.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passenger {
	@Id
	private String psId;
	private String PNR;
	private String bookingId;
	private String emailId;
	private String firstName;
	private String lastName;
	private String pincode;
	private String gender;
	private int phoneNumber;
	
	public Passenger() {
		// TODO Auto-generated constructor stub
	}
	
	public Passenger(String psId, String pNR, String bookingId, String emailId, String firstName, String lastName,
			String pincode, String gender, int phoneNumber) {
		super();
		this.psId = psId;
		PNR = pNR;
		this.bookingId = bookingId;
		this.emailId = emailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.pincode = pincode;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}

	public String getPsId() {
		return psId;
	}

	public void setPsId(String psId) {
		this.psId = psId;
	}

	public String getPNR() {
		return PNR;
	}

	public void setPNR(String pNR) {
		PNR = pNR;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Passenger [psId=" + psId + ", PNR=" + PNR + ", bookingId=" + bookingId + ", emailId=" + emailId
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", pincode=" + pincode + ", gender=" + gender
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
