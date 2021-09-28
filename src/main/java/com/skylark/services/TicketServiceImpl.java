package com.skylark.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * @author dhruvi.shah@stltech.in
 * @version 1.0
 * @creation_date 10-sept-2021
 * @copyright Skylark Airlines
 */


import org.springframework.stereotype.Service;

import com.skylark.entities.Ticket;
import com.skylark.exceptions.LoginNotFoundException;
import com.skylark.exceptions.TicketNotFoundException;
import com.skylark.repositories.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository ticketRepo;

	@Override
	public Ticket getTicketByFlightId(int fid) throws TicketNotFoundException {
		// TODO Auto-generated method stub
		return ticketRepo.findByFlight(fid).orElseThrow(()->new TicketNotFoundException("Ticket not found !"));
	}

	@Override
	public Ticket getTicketByBookingId(int bid) throws TicketNotFoundException {
		// TODO Auto-generated method stub
		return ticketRepo.findByBooking(bid).orElseThrow(()->new TicketNotFoundException("Ticket not found !"));
	}

	@Override
	public void addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		ticketRepo.save(ticket);
	}
		
}
