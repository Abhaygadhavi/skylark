package com.skylark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skylark.entities.CreditDebit;
import com.skylark.exceptions.CreditDebitNotFoundException;
import com.skylark.exceptions.LoginNotFoundException;
import com.skylark.repositories.CreditDebitRepository;

@Service
public class CreditDebitServiceImpl implements CreditDebitService {

	@Autowired
	private CreditDebitRepository creRepo;
	
	@Override
	public CreditDebit findbyCredit(long credit) throws CreditDebitNotFoundException {
		// TODO Auto-generated method stub
		return creRepo.findById(credit).orElseThrow(()->new CreditDebitNotFoundException("Credit card not found !"));
	}

	@Override
	public CreditDebit findbyDebit(long debit) throws CreditDebitNotFoundException {
		// TODO Auto-generated method stub
		return creRepo.findByDebitNo(debit).orElseThrow(()->new CreditDebitNotFoundException("Debit card  not found !"));
	}

}
