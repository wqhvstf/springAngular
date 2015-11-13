package com.angular.dao;

import java.util.List;

import com.angular.entity.User;

public interface UserMapper {
	int deleteByPrimaryKey(Integer userid);

	int deleteByUserName(String username);
	
	int deleteAll();

	int insert(User record);

	int insertSelective(User record);

	User login(User user);

	User selectByPrimaryKey(Integer userid);

	List<User> selectAllUser();

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}