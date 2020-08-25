package com.photoapp.api.users.service;

import java.util.ArrayList;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.photoapp.api.users.entity.User;
import com.photoapp.api.users.repository.UsersRepository;
import com.photoapp.api.users.to.UserTO;
import com.photoapp.api.users.util.ModelMapperUtil;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersRepository repository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Override
	public UserTO createUser(UserTO to) {
		to.setUserId(UUID.randomUUID().toString());
		to.setEncryptedPassword(encoder.encode(to.getPassword()));
		ModelMapper mapper = ModelMapperUtil.returnDefaultModelMapper();
		User user = mapper.map(to, User.class);
		
		repository.save(user);
	
		return ModelMapperUtil.returnDefaultModelMapper().map(user, UserTO.class);
		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User loggedUser = repository.findByEmail(username);
		
		if(loggedUser == null) {
			throw new UsernameNotFoundException(username);
		}
		
		return new org.springframework.security.core.userdetails.User(loggedUser.getEmail(),
				loggedUser.getEncryptedPassword() , true , true , true , true , new ArrayList<>());
	}

	@Override
	public UserTO getUserDetailsByEmail(String email) {
		return ModelMapperUtil.returnDefaultModelMapper()
				.map(repository.findByEmail(email), UserTO.class);
	}

}
