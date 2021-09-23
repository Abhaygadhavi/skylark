package com.skylark.services;

/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 09-sep-2021
 * @copyright Sterlite technologies Ltd.
 * @description Service Interface implementer for Login in business layer
 */

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skylark.entities.Login;
import com.skylark.entities.Booking;
import com.skylark.entities.Login;
import com.skylark.exceptions.BookingNotFoundException;
import com.skylark.exceptions.LoginNotFoundException;
import com.skylark.repositories.LoginRepository;


@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository userRepo;
	
	@Override
	public Login findByUsername(String username) throws LoginNotFoundException {
		// TODO Auto-generated method stub
		return userRepo.findByUsername(username).orElseThrow(()->new LoginNotFoundException("User not found !"));
	}

	@Override
	public List<Login> findAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public Login findByEmailId(String emailId) throws LoginNotFoundException{
		// TODO Auto-generated method stub
		return userRepo.findById(emailId).orElseThrow(()->new LoginNotFoundException("User not found !"));
	}

	@Override
	public Login findByPhone(long phoneNumber) throws LoginNotFoundException {
		// TODO Auto-generated method stub
		return userRepo.findByPhoneNumber(phoneNumber).orElseThrow(()->new LoginNotFoundException("User not found !"));
	}

	@Override
	public void addUser(Login user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
		
	}

	@Override
	public void delUser(String emailId) throws LoginNotFoundException {
		// TODO Auto-generated method stub
		Optional<Login> op=userRepo.findById(emailId);
		if (op.isPresent()) {
			userRepo.delete(op.get());
		} else {
			throw new LoginNotFoundException("there is no user according to this email-id");
		}
		
	}

	@Override
	public void editUser(Login user) throws LoginNotFoundException {
		// TODO Auto-generated method stub
		Optional<Login> op=userRepo.findById(user.getEmailId());
		if (op.isPresent()) {
			userRepo.save(user);
		} else {
			throw new LoginNotFoundException("there is no user according to this email-id");
		}
		
	}

}
