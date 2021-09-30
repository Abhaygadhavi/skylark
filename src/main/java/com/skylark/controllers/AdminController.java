package com.skylark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skylark.entities.Admin;
import com.skylark.exceptions.AdminNotFoundException;
import com.skylark.services.AdminService;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/validate")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	
	
	@PostMapping("/admin")
	public ResponseEntity<Admin> adminValidate(@RequestBody Admin admin) throws AdminNotFoundException
	{ 
		
		Admin a1 = adminService.findByAdminName(admin.getUsername());
		if(a1.getPassword().equals(admin.getPassword()))
		{
			
			return new ResponseEntity<>(a1, HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(a1, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	
	
}
