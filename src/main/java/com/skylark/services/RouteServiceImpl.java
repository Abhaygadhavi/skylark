package com.skylark.services;
/*
 * @author mansi.jain@stltech.in
 * @version 1.0
 * @creation_date 08-sep-2021
 * @copyright Sterlite technologies Ltd.
 * @description Service Interface Implementer for Route in business layer
 */
import java.util.List;

import com.skylark.entities.Route;
import com.skylark.exceptions.RouteNotFoundException;
import com.skylark.repositories.RouteRepository;

public class RouteServiceImpl implements RouteService {
	
	private RouteRepository routeRepo;

	@Override
	public Route findRouteById(int id) throws RouteNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Route> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Route route) {
		// TODO Auto-generated method stub

	}

	@Override
	public void edit(Route route) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Route route) {
		// TODO Auto-generated method stub

	}

}
