package com.skylark.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skylark.entities.Payment;
import com.skylark.repositories.PaymentRepository;
@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentRepository paymentrepo;

	@Override
	public String addPayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentrepo.save(payment);
		return "payment of " + payment.getPaymentId() + " is added";
	}
	


}
