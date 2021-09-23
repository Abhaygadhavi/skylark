/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Skylark Airlines
 */

package com.skylark.services;

<<<<<<< HEAD
import java.util.List;
import java.util.Optional;

=======
>>>>>>> f3511c4fdf931c143d447b2929f78e7c0b424cb2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skylark.entities.Airports;
<<<<<<< HEAD
import com.skylark.exceptions.AirportAlreadyExistsException;
=======
>>>>>>> f3511c4fdf931c143d447b2929f78e7c0b424cb2
import com.skylark.exceptions.AirportNotFoundException;
import com.skylark.repositories.AirportRepository;

@Service
public class AirportServiceImpl implements AirportService {
	
	@Autowired
	private AirportRepository airRepo;
	
	@Override
	public Airports findByName(String name) throws AirportNotFoundException {
		// TODO Auto-generated method stub
		return airRepo.findByAirportName(name).orElseThrow(()->new AirportNotFoundException("Sorry! No Airport exists"));

	}

	@Override
	public Airports findByIATACode(String id) throws AirportNotFoundException {
		// TODO Auto-generated method stub
		return airRepo.findById(id).orElseThrow(()->new AirportNotFoundException("Sorry! No Airport exists"));
	}

<<<<<<< HEAD
	@Override
	public void addAirport(Airports a) throws AirportAlreadyExistsException {
		// TODO Auto-generated method stub
		Optional<Airports> op = airRepo.findById(a.getIATACode());
		if(op.isPresent())
			throw new AirportAlreadyExistsException("Airport with IATACode: "+ a.getIATACode()+" is already present");
		else
			airRepo.save(a);
	}

	@Override
	public void editAirport(Airports a) throws AirportNotFoundException {
		// TODO Auto-generated method stub
		Optional<Airports> op = airRepo.findById(a.getIATACode());
		if(op.isPresent())
			airRepo.save(a);
		else
			throw new AirportNotFoundException("Sorry! No Airports exists");
	}

	@Override
	public List<Airports> getAllAirports() {
		// TODO Auto-generated method stub
		return airRepo.findAll();
	}

=======
>>>>>>> f3511c4fdf931c143d447b2929f78e7c0b424cb2
}
