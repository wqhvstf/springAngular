package com.angular.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angular.dao.UserMapper;
import com.angular.entity.User;
import com.angular.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userDao;

	@Override
	public User login(User user) {
		return userDao.login(user);
	}

	@Override
	public User getUserById(int id) {
		return userDao.selectByPrimaryKey(id);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.selectAllUser();
	}

	@Override
	public void addUser(String userName) {
		User user = new User();
		user.setUsername(userName);
		userDao.insert(user);
	}

	@Override
	public void deleteUser(String userName) {
		userDao.deleteByUserName(userName);
	}

	@Override
	public void deleteAll() {
		userDao.deleteAll();
	}

}
