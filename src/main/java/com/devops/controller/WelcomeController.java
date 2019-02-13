package com.devops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devops.service.impl.WelcomeServiceImpl;

@RestController
public class WelcomeController {
	
	@Autowired
	private WelcomeServiceImpl welcomeServiceImpl;
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return welcomeServiceImpl.welcome();
	}
}
