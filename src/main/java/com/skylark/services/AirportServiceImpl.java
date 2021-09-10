/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Skylark Airlines
 */

package com.skylark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skylark.entities.Airports;
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

}
