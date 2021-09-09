package com.skylark.services;
/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 09-sep-2021
 * @copyright Sterlite technologies Ltd.
 * @description Service Interface for Admin in business layer
 */

import java.util.List;

import com.skylark.entities.Admin;
import com.skylark.exceptions.AdminNotFoundException;

public interface AdminService {
	
	Admin findByAdminName(String username) throws AdminNotFoundException;
	//List <Admin> findAllAdmins();
}
