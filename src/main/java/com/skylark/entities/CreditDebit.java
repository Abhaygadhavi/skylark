package com.skylark.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
public class CreditDebit {

	@Id
	private long creditNo;
	@NotNull
	private long debitNo;
	
	@NotNull
	private String expDate;
	@NotNull
	private int cvv;
	
	public CreditDebit() {
		// TODO Auto-generated constructor stub
	}

	public CreditDebit(long creditNo, long debitNo, String expDate, int cvv) {
		super();
		this.creditNo = creditNo;
		this.debitNo = debitNo;
		this.expDate = expDate;
		this.cvv = cvv;
	}

	public long getCreditNo() {
		return creditNo;
	}

	public void setCreditNo(long creditNo) {
		this.creditNo = creditNo;
	}

	public long getDebitNo() {
		return debitNo;
	}

	public void setDebitNo(long debitNo) {
		this.debitNo = debitNo;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "CreditDebit [creditNo=" + creditNo + ", debitNo=" + debitNo + ", expDate=" + expDate + ", cvv=" + cvv
				+ "]";
	}
	
	
	
}
