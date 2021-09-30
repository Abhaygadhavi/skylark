package com.skylark.services;

import com.skylark.entities.CreditDebit;
import com.skylark.exceptions.CreditDebitNotFoundException;

public interface CreditDebitService {

	CreditDebit findbyCredit(long credit) throws CreditDebitNotFoundException;
	CreditDebit findbyDebit(long debit) throws CreditDebitNotFoundException;
}
