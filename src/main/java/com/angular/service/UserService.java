package com.angular.service;

import java.util.List;

import com.angular.entity.User;

public interface UserService {
	public User login(User user);

	public User getUserById(int id);

	public List<User> getAllUsers();

	public void addUser(String userName);

	public void deleteUser(String userName);

	public void deleteAll();
}
