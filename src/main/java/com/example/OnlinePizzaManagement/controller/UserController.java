package com.example.OnlinePizzaManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlinePizzaManagement.service.IUserService;

@RestController
public class UserController 
{
  
	@Autowired
	public IUserService userService;
}
