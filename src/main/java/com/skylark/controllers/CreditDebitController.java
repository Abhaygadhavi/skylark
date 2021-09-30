package com.skylark.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skylark.entities.CreditDebit;
import com.skylark.entities.Login;
import com.skylark.exceptions.CreditDebitNotFoundException;
import com.skylark.exceptions.LoginNotFoundException;
import com.skylark.services.CreditDebitService;
import com.skylark.services.LoginService;

@RestController
@RequestMapping("/card")
@CrossOrigin(origins = "http://localhost:4200")
public class CreditDebitController {

	@Autowired
	private CreditDebitService cardService;
	
	@PostMapping("/validate")
	public ResponseEntity<CreditDebit> cardValidate(@RequestBody CreditDebit card)
	{ 
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM,yyyy");
//		String date= card.getExpDate().format(formatter);
//		LocalDate date1=LocalDate.parse(date);
//		card.setExpDate(date1);
		
		System.out.println("o"+card);
		CreditDebit c1 = new CreditDebit();
		try {
			if(card.getCreditNo()!=0) {
				c1 = cardService.findbyCredit(card.getCreditNo());
				System.out.println("Credit card"+c1);
			}
			if(card.getDebitNo()!=0) {
				c1 = cardService.findbyDebit(card.getDebitNo());
				System.out.println("Debit card"+c1);
			}
		} catch (CreditDebitNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		if(c1.getCvv()!=0 && c1.getCvv()==card.getCvv() && c1.getExpDate()!=null 
//				&& c1.getExpDate().getMonth().equals(card.getExpDate().getMonth()) 
//				&& c1.getExpDate().getYear()==card.getExpDate().getYear())
		if(c1.getCvv()!=0 && c1.getCvv()==card.getCvv() && c1.getExpDate()!=null 
				&& c1.getExpDate().equals(card.getExpDate()))
		{
			System.out.println("a");
			
			return new ResponseEntity<>(c1,HttpStatus.OK);
		}
		else
		{
			System.out.println("na");
			return new ResponseEntity<>(c1, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
