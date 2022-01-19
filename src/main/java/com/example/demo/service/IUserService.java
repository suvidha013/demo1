package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.example.demo.UserRepository;

public class IUserService {
	@Autowired //DI
	UserRepository userRepository;
public void saveUser(User user)
{
	userRepository.save(user);
}
}
