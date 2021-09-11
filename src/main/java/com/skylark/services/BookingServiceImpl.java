package com.skylark.services;

/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 11-sep-2021
 * @copyright Sterlite technologies Ltd.
 * @description Service Interface implementer for Booking in business layer
 */

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skylark.entities.Booking;
import com.skylark.exceptions.BookingNotFoundException;
import com.skylark.exceptions.FlightNotFoundException;
import com.skylark.repositories.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingRepository bookRepo;

	@Override
	public void addBooking(Booking b) {
		// TODO Auto-generated method stub
		bookRepo.save(b);
		
	}

	@Override
	public void deleteBooking(int id) throws BookingNotFoundException {
		// TODO Auto-generated method stub
		Optional<Booking> op=bookRepo.findById(id);
		if (op.isPresent()) {
			bookRepo.delete(op.get());
		} else {
			throw new BookingNotFoundException("there is no booking according to this id");
		}
	}

	@Override
	public void editBooking(Booking b) throws BookingNotFoundException {
		// TODO Auto-generated method stub
		Optional<Booking> op=bookRepo.findById(b.getBookingId());
		if (op.isPresent()) {
			bookRepo.save(b);
		} else {
			throw new BookingNotFoundException("there is no booking according to this id");
		}
	}

	@Override
	public void checkStatus(Booking b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Booking> findByBookingId(int id) throws BookingNotFoundException {
		// TODO Auto-generated method stub
		return bookRepo.findByBookId(id);
	}

	@Override
	public List<Booking> findByJourneyDate(LocalDate date) throws FlightNotFoundException {
		// TODO Auto-generated method stub
		return bookRepo.findByJourDate(date);
	}
	
	

}
