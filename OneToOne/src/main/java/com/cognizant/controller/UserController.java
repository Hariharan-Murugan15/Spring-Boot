package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.User;
import com.cognizant.service.IUserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RequestMapping("/api/v1")
@RestController
public class UserController {
	@Autowired
	IUserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<User> addUser(@RequestBody User user){
		return new ResponseEntity<User>(userService.createUser(user), HttpStatus.OK);
	}
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> getUser(){
		return new ResponseEntity<List<User>>(userService.viewAllUser(), HttpStatus.OK);
	}
}
