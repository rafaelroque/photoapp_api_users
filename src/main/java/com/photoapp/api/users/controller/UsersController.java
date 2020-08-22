package com.photoapp.api.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private Environment env;

	@GetMapping
	public String status() {
		return "Working on port  "+env.getProperty("local.server.port");
	}
}
