/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 11-sept-2021
 * @copyright Skylark Airlines
 */

package com.skylark.controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skylark.entities.Booking;
import com.skylark.exceptions.BookingNotFoundException;
import com.skylark.exceptions.FlightNotFoundException;
import com.skylark.services.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	private BookingService bookService;
	
	@GetMapping("/add")
	public String insertBooking(@RequestBody Booking b) {
		bookService.addBooking(b);
		return "Booking successfull";
	}
	
	@GetMapping("/del")
	public String delBooking(@RequestBody int id) {
		try {
			bookService.deleteBooking(id);
			return "Booking Cancelled";
		} catch (BookingNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Your booking is not present";
	}
	
	@GetMapping("/date")
	public String getByJourDate(@RequestBody LocalDate date) {
		try {
			bookService.findByJourneyDate(date);
			return "Booking Detais Updated";
		} catch (FlightNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Your booking is not present";
	}
	
}
