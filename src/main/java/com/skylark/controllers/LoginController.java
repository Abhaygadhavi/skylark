package com.skylark.controllers;



import java.util.List;

/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 10-sept-2021
 * @copyright Skylark Airlines
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skylark.entities.Login;
import com.skylark.exceptions.LoginNotFoundException;
import com.skylark.services.LoginService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	@Autowired
	private LoginService userService;
	
	@PostMapping("/name")
	public ResponseEntity<Login> userValidate(@RequestBody Login user)
	{ 
		System.out.println("o"+user);
		Login l1 = new Login();
		try {
			if(!user.getEmailId().equals(null)  && !user.getEmailId().equals("")) {
				l1 = userService.findByEmailId(user.getEmailId());
				System.out.println("e"+l1);
			}
			if(user.getPhoneNumber()!= 0) {
				l1 = userService.findByPhone(user.getPhoneNumber());
				System.out.println("p"+l1);
			}
		} catch (LoginNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(l1.getPassword()!=null && l1.getPassword().equals(user.getPassword()))
		{
			System.out.println("a");
			
			return new ResponseEntity<>(l1,HttpStatus.OK);
		}
		else
		{
			System.out.println("na");
			return new ResponseEntity<>(l1, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/users")
	public List<Login> findAll(){
		return userService.findAllUsers();
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
