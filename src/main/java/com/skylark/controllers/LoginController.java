package com.skylark.controllers;



import java.util.List;

/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 10-sept-2021
 * @copyright Skylark Airlines
 */

import org.springframework.beans.factory.annotation.Autowired;
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
@CrossOrigin
public class LoginController {

	@Autowired
	private LoginService userService;
	
	@PostMapping("/name")
	public String userValidate(@RequestBody Login user)
	{ 
		System.out.println("o"+user);
		Login l1 = new Login();
		try {
			if(user.getEmailId()!= null) {
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
			return "user not found";
		}
		if(l1.getPassword().equals(user.getPassword()))
		{
			System.out.println("a");
			
			return "user available";
		}
		else
		{
			System.out.println("na");
			return "user not available";
		}
	}
	@GetMapping("/users")
	public List<Login> findAll(){
		return userService.findAllUsers();
	}
}
