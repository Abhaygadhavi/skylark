package com.skylark.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.skylark.entities.Ticket;
import com.skylark.exceptions.TicketNotFoundException;
import com.skylark.services.TicketService;

@RestController
@RequestMapping("/addticket")
public class TicketController {

	@Autowired
	private TicketService ticketservice;

	@GetMapping("/findticketbyfid")
	public Ticket findTicketByFlightId(@RequestParam("fid") int fid)  {
		// TODO Auto-generated method stub
		try {
			return ticketservice.getTicketByFlightId(fid);
		} catch (TicketNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@GetMapping("/findticketbybid")
	public Ticket findTicketByBookingId(@RequestParam("bid") int bid)  {
		// TODO Auto-generated method stub
		try {
			return ticketservice.getTicketByBookingId(bid);
		} catch (TicketNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@PutMapping
	public void addTicket(@RequestBody Ticket ticket) {
		// TODO Auto-generated method stub
		ticketservice.addTicket(ticket);
	}
		
}
