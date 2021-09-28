package com.skylark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skylark.entities.Payment;
import com.skylark.repositories.PaymentRepository;
import com.skylark.services.PaymentService;

@RestController
@RequestMapping("/addpayment")
public class PaymentController {

	@Autowired
	PaymentService payService;
	
	@PutMapping
	 String addPayment(@RequestBody Payment payment) {
		// TODO Auto-generated method stub
		 payService.addPayment(payment);
		 return "Payment Succesful";
		
	}
}
