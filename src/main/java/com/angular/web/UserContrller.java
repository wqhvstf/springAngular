package com.angular.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.angular.entity.User;
import com.angular.service.UserService;

@Controller
@RequestMapping("/users")
public class UserContrller {
	private UserService userService;

	@RequestMapping("/userList")
	@ResponseBody
	public List<User> getAllUser() {
		return userService.getAllUsers();
	}

	@RequestMapping(value = "/addUser/{username}", method = { RequestMethod.POST })
	public void addUser(@PathVariable(value = "username") String username) {
		userService.addUser(username);
	}

	@RequestMapping(value = "/removeUser/{userName}", method = { RequestMethod.POST })
	public void removeUser(@PathVariable(value = "userName") String userName) {
		userService.deleteUser(userName);
	}

	@RequestMapping(value = "/removeAllUser", method = { RequestMethod.POST })
	public void removeAllUser() {
		userService.deleteAll();
	}

	@RequestMapping("/layout")
	public String getUserPartialPage() {
		return "users/layout";
	}
}
