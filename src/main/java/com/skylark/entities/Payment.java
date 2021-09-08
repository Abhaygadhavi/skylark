package com.skylark.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Payment {
	@Id
	@GeneratedValue(generator = "increment")
	private int paymentId;
	private String paymentType;
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(int paymentId, String paymentType) {
		super();
		this.paymentId = paymentId;
		this.paymentType = paymentType;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentType=" + paymentType + "]";
	}
	
	
}
