package com.example.demo.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.RequestBody;
import com.example.demo.service.IUserService;


@RestController


public class UserController {
	@Autowired
	IUserService userService;

	@GetMapping("/user")
	
     Iterable<User> getUser(){
		
		return UserService.getUser();
	
}
	@GetMapping("/user/{id}")
	Iterable<User> getUsers(@PathVariable("id") Integer id){
		return UserService.getUser(id);
	}
	@PostMapping("/user")
	@RespponseStatus(code = HttpStatus.CREATED)
	void createUser(@RequestBody @Valid User user )
	 {
		 System.out.println(user.getName());
		 userService.saveUser(user);
	 }
	@DeleteMapping("/user/{id}")
	void deleteUser(@PathVariable("id") Integer id)
	{
		UserService.deleteUser(id);
		
	}
	
	}
