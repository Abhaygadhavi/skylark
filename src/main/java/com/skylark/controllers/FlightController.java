/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Skylark Airlines
 */

package com.skylark.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skylark.entities.Flight;
import com.skylark.exceptions.FlightNotFoundException;
import com.skylark.services.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {
	
	@Autowired
	private FlightService fliService;
	
	@PostMapping("/add")
	public String insertFlight(@RequestBody Flight f) {
		fliService.addFlight(f);
		return "Flight Added Successfully";
	}
	
	@PostMapping("/delete")
	public String deleteFlight(@RequestParam("id") int id) {
		try {
			fliService.delFlight(id);
			return "Flight deleted Successfully";
		} catch (FlightNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Flight Not Found";
	}
	
	@PostMapping("/edit")
	public String updateFlight(@RequestBody Flight f) {
		try {
			fliService.editFlight(f);
			return "Flight updated Successfully";
		} catch (FlightNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Flight Not Found";
	}
	
}
