package com.manipal.dao;

import java.util.List;

import com.manipal.model.User;

public interface IUserDao {
	public int addUser(User user);
	public List<User> getAllUsers();
	public int updateUser(User user);
}
