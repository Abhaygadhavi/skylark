package com.skylark.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skylark.entities.Admin;
import com.skylark.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, String> {


	Optional<Ticket> findByFlight(int fid);
	Optional<Ticket> findByBooking(int bid);
}
