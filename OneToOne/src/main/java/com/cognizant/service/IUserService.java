package com.cognizant.service;

import java.util.List;

import com.cognizant.entity.User;

public interface IUserService {
	public User createUser(User user);
	public List<User> viewAllUser();
	public User findByUserId(int id);
}
