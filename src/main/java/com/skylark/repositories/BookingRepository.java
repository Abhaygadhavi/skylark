package com.skylark.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skylark.entities.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

	List<Booking> findByBookId(int id);

	List<Booking> findByJourDate(LocalDate date);

}
