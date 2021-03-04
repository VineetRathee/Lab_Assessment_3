package com.traineeApp.Service;

import com.traineeApp.userdao.User;

public interface UserService {
	public void addUser(User user);
	public User getUser(String username,String password);
}
