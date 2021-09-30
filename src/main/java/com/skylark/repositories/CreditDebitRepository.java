package com.skylark.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skylark.entities.CreditDebit;

public interface CreditDebitRepository extends JpaRepository<CreditDebit, Long> {

	Optional<CreditDebit> findByDebitNo(long debit);

}
