package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class UserController {
	
	@GetMapping("/user")
	
String getUser(){
		System.out.println("testing");
		return "testing";
	
}
	void createUser(@RequestBody User user )
	 {
		 System.out.println(user.getName());
	 }
	
	}
