/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 10-sept-2021
 * @copyright Skylark Airlines
 */
package com.skylark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skylark.entities.Airports;
import com.skylark.exceptions.AirportNotFoundException;
import com.skylark.services.AirportService;

@RestController
@RequestMapping("/airport")
public class AirportController {
	@Autowired
	private AirportService airService;
	
	@GetMapping("/name/{nm}")
	public Airports getByName(@PathVariable("nm") String name) {
		try {
			return airService.findByName(name);
		} catch (AirportNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping("/code/{code}")
	public Airports getByCode(@PathVariable("code") String code) {
		try {
			return airService.findByIATACode(code);
		} catch (AirportNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
