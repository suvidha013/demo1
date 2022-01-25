package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.UserRepository;
@Service
public class IUserService {
	@Autowired //DI
	UserRepository userRepository;
public void saveUser(User user)
{
	userRepository.save(user);
}
public Iterable<User> getUsers(){
	
	return userRespository.findAll();
}
public Optional<User> getUser(Integer id)
{
	return userRepository.findById(id);
}
}
