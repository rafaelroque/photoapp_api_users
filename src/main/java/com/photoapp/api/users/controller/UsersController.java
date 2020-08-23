package com.photoapp.api.users.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.photoapp.api.users.rest.CreateUserResponse;
import com.photoapp.api.users.service.UsersService;
import com.photoapp.api.users.to.UserTO;
import com.photoapp.api.users.util.ModelMapperUtil;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private Environment env;
	
	@Autowired
	private UsersService service;

	@GetMapping
	public String status() {
		return "Working on port  "+env.getProperty("local.server.port");
	}
	
	@PostMapping
	public ResponseEntity<CreateUserResponse> createUser(@RequestBody @Valid UserTO userTo) {
		 userTo = service.createUser(userTo);
		 return ResponseEntity.status(HttpStatus.CREATED)
				 .body(ModelMapperUtil.returnDefaultModelMapper().map(userTo, CreateUserResponse.class));
	}
}
