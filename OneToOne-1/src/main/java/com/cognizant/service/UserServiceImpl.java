package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.entity.User;
import com.cognizant.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public List<User> viewAllUser(){
		return userRepository.findAll();
	}
	
	@Override
	public User findByUserId(int id) {
		return userRepository.findById(id).orElse(null);
	}
}
