package com.example.demo;


import org.springframework.data.repository.CrudRepository;


import com.example.demo.Entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	void save(org.springframework.boot.autoconfigure.security.SecurityProperties.User user);



}
