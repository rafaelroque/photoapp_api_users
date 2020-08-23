package com.photoapp.api.users.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.photoapp.api.users.entity.User;
import com.photoapp.api.users.repository.UsersRepository;
import com.photoapp.api.users.to.UserTO;
import com.photoapp.api.users.util.ModelMapperUtil;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersRepository repository;

	@Override
	public UserTO createUser(UserTO to) {
		to.setUserId(UUID.randomUUID().toString());
		ModelMapper mapper = ModelMapperUtil.returnDefaultModelMapper();
		User user = mapper.map(to, User.class);
		user.setEncryptedPassword("test");
		repository.save(user);
	
		return ModelMapperUtil.returnDefaultModelMapper().map(user, UserTO.class);
		
	}

}
