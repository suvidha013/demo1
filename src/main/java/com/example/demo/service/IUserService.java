package com.example.demo.service;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.example.demo.UserRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional;
@Service
public class IUserService {
	@Autowired
	
	UserRepository userRepository;

	public void saveUser(@Valid User user) {
	
		
		userRepository.save(user);
	}
public Iterable<User> getUsers() {
	return userRepository.findAll();
	 
}
public Optional<User> getUser(Integer id){
	return userRepository.findById(id);
}
public void deleteUser(Integer id) {
	userRepository.deleteById(id);
}
}
