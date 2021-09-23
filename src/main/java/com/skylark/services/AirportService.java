/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Skylark Airlines
 */

package com.skylark.services;

<<<<<<< HEAD
import java.util.List;

import com.skylark.entities.Airports;
import com.skylark.exceptions.AirportAlreadyExistsException;
=======
import com.skylark.entities.Airports;
>>>>>>> f3511c4fdf931c143d447b2929f78e7c0b424cb2
import com.skylark.exceptions.AirportNotFoundException;

public interface AirportService {
	Airports findByName(String name) throws AirportNotFoundException;
	Airports findByIATACode(String id) throws AirportNotFoundException;
<<<<<<< HEAD
	void addAirport(Airports a) throws AirportAlreadyExistsException;
	void editAirport(Airports a) throws AirportNotFoundException;
	List<Airports> getAllAirports();
=======
>>>>>>> f3511c4fdf931c143d447b2929f78e7c0b424cb2
}
