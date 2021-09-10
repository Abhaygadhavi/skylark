/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Skylark Airlines
 */

package com.skylark.services;

import java.util.List;

import com.skylark.entities.Flight;
import com.skylark.exceptions.FlightNotFoundException;

public interface FlightService {
	void addFlight(Flight f);
	void delFlight(int id) throws FlightNotFoundException;
	void editFlight(Flight f) throws FlightNotFoundException;
	List<Flight> findFlightByRouteId(int id);
}
