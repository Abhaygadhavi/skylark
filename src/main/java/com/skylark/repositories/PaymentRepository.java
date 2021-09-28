package com.skylark.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skylark.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, String> {

}
