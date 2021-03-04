package com.traineeApp.Service;

import com.traineeApp.userdao.User;
import com.traineeApp.userdao.UserDao;
import com.traineeApp.userdao.UserDaoImpl;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl() {
		userDao = new UserDaoImpl();
	}

	@Override
	public void addUser(User user) {
		 userDao.addUser(user);
	}

	@Override
	public User getUser(String username, String password) {
		return userDao.getUser(username,password);
	}
	
}
