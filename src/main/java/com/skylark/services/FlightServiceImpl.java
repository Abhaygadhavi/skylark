/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Skylark Airlines
 */

package com.skylark.services;

import com.skylark.entities.Flight;
import com.skylark.exceptions.FlightNotFoundException;
import com.skylark.repositories.FlightRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	private FlightRepository fliRepo;
	
	@Override
	public void addFlight(Flight f) {
		// TODO Auto-generated method stub
		fliRepo.save(f);
	}

	@Override
	public void delFlight(int id) throws FlightNotFoundException {
		// TODO Auto-generated method stub
		Optional<Flight> op = fliRepo.findById(id);
		if(op.isPresent())
			fliRepo.delete(op.get());
		else
			throw new FlightNotFoundException("Sorry! No Flight exists");
	}

	@Override
	public void editFlight(Flight f) throws FlightNotFoundException {
		// TODO Auto-generated method stub
		Optional<Flight> op = fliRepo.findById(f.getFlightId());
		if(op.isPresent())
			fliRepo.save(f);
		else
			throw new FlightNotFoundException("Sorry! No Flight exists");
	}

	@Override
	public List<Flight> findFlightByRouteId(int id) {
		// TODO Auto-generated method stub
		return fliRepo.findByRoute_RouteId(id);
	}

}
