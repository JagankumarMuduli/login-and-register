package com.dao;

import org.apache.catalina.User;

public interface userDao {

	boolean addUser(User user);
	boolean isValidUser(String username, String password);
}
