package com.skylark.services;
/*
 * @author mansi.jain@stltech.in
 * @version 1.0
 * @creation_date 08-sep-2021
 * @copyright Sterlite technologies Ltd.
 * @description Service Interface for Route in business layer
 */
import java.util.List;

import com.skylark.entities.Route;
import com.skylark.exceptions.RouteNotFoundException;

public interface RouteService {
	
	Route findRouteById(int id) throws RouteNotFoundException;
	List<Route> findAll(); 
	void add(Route route); 
	void edit(Route route); 
	void remove(Route route);

}
