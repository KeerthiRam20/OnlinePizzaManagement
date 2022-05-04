package com.example.OnlinePizzaManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlinePizzaManagement.repo.UserRepository;

@Service
public class UserServiceImp implements IUserService
{

	 @Autowired
	 public UserRepository userRepo;
}
