package com.skylark.controllers;

/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 10-sept-2021
 * @copyright Skylark Airlines
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skylark.entities.Login;
import com.skylark.entities.Passenger;
import com.skylark.exceptions.BookingNotFoundException;
import com.skylark.exceptions.LoginNotFoundException;
import com.skylark.exceptions.PassengerNotFoundException;
import com.skylark.services.LoginService;

@RestController
@RequestMapping("/user")
public class LoginController {

	@Autowired
	private LoginService userService;
	
	@PostMapping("/name")
	public String userValidate(@RequestBody Login user) 
	{ 
		
		try {
			Login l1 = userService.findByUsername(user.getUsername());
			if(l1.getPassword().equals(user.getPassword()))
			{
				
				return "user available";
			}
			else
			{
				return "user not available";
			}
		} catch (LoginNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("/signup")
	public String insertUser(@RequestBody Login user) {
		userService.addUser(user);
		return "User added successfull";
	}
	
	@PostMapping("/edit")
	public String updateUser(@RequestBody Login user) throws LoginNotFoundException {
		userService.editUser(user);
		return "Passenger updated Successfully";
	}
	
	@GetMapping("/del")
	public String delBooking(@RequestBody String emailId) {
		try {
			userService.delUser(emailId);
			return "User Deleted";
		} catch (LoginNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Your User is not present";
	}
}
