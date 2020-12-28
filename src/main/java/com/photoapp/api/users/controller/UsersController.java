package com.photoapp.api.users.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private Environment env;
	
	
	@GetMapping
	public String status() {
		return "Working ";
	}
	
//	@PostMapping(consumes = {MediaType.APPLICATION_XML_VALUE , MediaType.APPLICATION_JSON_VALUE },
//			     produces = {MediaType.APPLICATION_XML_VALUE , MediaType.APPLICATION_JSON_VALUE }
//			    )
//	
//	public ResponseEntity<CreateUserResponse> createUser(@RequestBody @Valid UserTO userTo) {
//		 userTo = service.createUser(userTo);
//		 return ResponseEntity.status(HttpStatus.CREATED)
//				 .body(ModelMapperUtil.returnDefaultModelMapper().map(userTo, CreateUserResponse.class));
//	}
}
