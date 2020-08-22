package com.photoapp.api.users.service;

import com.photoapp.api.users.to.UserTO;

public interface UsersService {

	UserTO createUser(UserTO to);
	
}
