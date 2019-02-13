package com.devops.service.impl;

import org.springframework.stereotype.Service;

import com.devops.service.WelcomeService;

@Service
public class WelcomeServiceImpl implements WelcomeService{

	@Override
	public String welcome() {
		return "Welcome to dev";
	}
}
