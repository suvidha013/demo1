package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.example.demo.UserRepository;
@Service
public class IUserService {
	@Autowired
	
	UserRepository userRepository;

	public void saveUser(@Valid User user) {
	
		
		userRepository.save(user);
	}

}
