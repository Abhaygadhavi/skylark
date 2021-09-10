package com.skylark.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skylark.entities.Admin;
import com.skylark.entities.Login;
import com.skylark.exceptions.AdminNotFoundException;
import com.skylark.exceptions.LoginNotFoundException;
import com.skylark.services.AdminService;
import com.skylark.services.LoginService;

@RestController
@RequestMapping("/validate")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	
	
	@GetMapping("/admin")
	public String adminValidate(@RequestBody Admin admin) throws AdminNotFoundException
	{ 
		
		Admin a1 = adminService.findByAdminName(admin.getUsername());
		if(a1.getPassword().equals(admin.getPassword()))
		{
			
			return "Admin available";
		}
		else
		{
			return "Admin not available";
		}
	}
	
	
	
	
	
}
