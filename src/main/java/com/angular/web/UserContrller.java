package com.angular.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.angular.entity.User;
import com.angular.service.UserService;

@RestController
@RequestMapping("/users")
public class UserContrller {
	@Autowired
	private UserService userService;

	@RequestMapping("/userList")
	public List<User> getAllUser() {
		return userService.getAllUsers();
	}

	@RequestMapping(value = "/addUser/{username}", method = { RequestMethod.POST })
	public void addUser(@PathVariable(value = "username") String username) {
		userService.addUser(username);
	}

	@RequestMapping(value = "/removeUser/{username}", method = { RequestMethod.POST })
	public void removeUser(@PathVariable(value = "username") String username) {
		userService.deleteUser(username);
	}

	@RequestMapping(value = "/removeAllUser", method = { RequestMethod.POST })
	public void removeAllUser() {
		userService.deleteAll();
	}
}
