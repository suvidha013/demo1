package com.example.demo;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController


public class UserController {
	
	@GetMapping("/user")
	
String getUser(){
		System.out.println("testing");
		return "testing";
	
}
	@PostMapping("/user")
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
