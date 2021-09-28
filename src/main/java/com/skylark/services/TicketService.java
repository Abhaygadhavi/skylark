package com.skylark.services;

import java.util.List;
import java.util.Optional;

import com.skylark.entities.Ticket;
import com.skylark.exceptions.TicketNotFoundException;



public interface TicketService  {

	Ticket getTicketByFlightId(int fid) throws TicketNotFoundException;
	Ticket getTicketByBookingId(int bid) throws TicketNotFoundException;
	
	void addTicket(Ticket ticket);
	
}
