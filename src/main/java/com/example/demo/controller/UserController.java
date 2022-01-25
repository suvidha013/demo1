package com.example.demo.controller;



import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.RequestBody;


@RestController


public class UserController {

	@GetMapping("/user")
	
     Iterable<User> getUser(){
		
		return UserService.getUser();
	
}
	@GetMapping("/user/id")
	Iterable<User> getUsers(@PathVariable("id") Integer id){
		return UserService.getUser();
	}
	@PostMapping("/user")
	@RespponseStatus
	void createUser(@RequestBody User user )
	 {
		 System.out.println(user.getName());
	 }
	@DeleteMapping("/user")
	void deleteUser()
	{//comments
		System.out.println("hi");
		
	}
	
	}
