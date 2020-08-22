package com.photoapp.api.users.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.photoapp.api.users.to.UserTO;

@Service
public class UsersServiceImpl implements UsersService {

	@Override
	public UserTO createUser(UserTO to) {
		to.setUserId(UUID.randomUUID().toString());
		return to;
	}

}
