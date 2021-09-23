package com.skylark.controllers;
/*
 * @author mansi.jain@stltech.in
 * @version 1.0
 * @creation_date 11-sept-2021
 * @copyright Skylark Airline
 * @description Request Processor Web Component of Spring Web MVC
 */

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
>>>>>>> f3511c4fdf931c143d447b2929f78e7c0b424cb2
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skylark.entities.Route;
import com.skylark.exceptions.RouteNotFoundException;
import com.skylark.services.RouteService;


@RestController
@RequestMapping("/route")
public class RouteController {
	
	@Autowired
	private RouteService roService;
	
<<<<<<< HEAD
	@PutMapping("/add")
=======
	@PostMapping("/add")
>>>>>>> f3511c4fdf931c143d447b2929f78e7c0b424cb2
	public String insertRoute(@RequestBody Route route) throws RouteNotFoundException {
		roService.addRoute(route);
		return "Route Added Successfully";
	}
	
	@PostMapping("/edit")
	public String updateroute(@RequestBody Route route) throws RouteNotFoundException {
		roService.editRoute(route);
		return "Route updated Successfully";
	}
	
<<<<<<< HEAD
	@DeleteMapping("/delete")
=======
	@PostMapping("/delete")
>>>>>>> f3511c4fdf931c143d447b2929f78e7c0b424cb2
	public String deleteRoute(@RequestBody String routeId) throws RouteNotFoundException {
		roService.removeRoute(routeId);
		return "Route deleted Successfully";
		
	}
	
	@PostMapping("/fromCity")
	public Route getByFromCity(@RequestParam("FromCity") String fromCity) {
		try {
<<<<<<< HEAD
			return roService.findByFromCity(fromCity);
=======
			return (Route) roService.findByFromCity(fromCity);
>>>>>>> f3511c4fdf931c143d447b2929f78e7c0b424cb2

		} catch (RouteNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("/toCity")
	public Route getByToCity(@RequestParam("FromCity") String toCity) {
		try {
<<<<<<< HEAD
			return roService.findByToCity(toCity);

		} catch (RouteNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping("/id")
	public Route getByRouteId(@RequestParam("id") String id) {
		try {
			return roService.findRouteById(id);
=======
			return (Route) roService.findByToCity(toCity);
>>>>>>> f3511c4fdf931c143d447b2929f78e7c0b424cb2

		} catch (RouteNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
<<<<<<< HEAD
	
	@GetMapping("/routes")
	public List<Route> getAllRoutes() {
		return roService.findAll();
	}
=======
>>>>>>> f3511c4fdf931c143d447b2929f78e7c0b424cb2

}
