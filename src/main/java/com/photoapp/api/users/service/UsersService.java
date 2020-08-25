package com.photoapp.api.users.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.photoapp.api.users.to.UserTO;

public interface UsersService extends UserDetailsService {

	UserTO createUser(UserTO to);
	UserTO getUserDetailsByEmail(String email);
	
}
