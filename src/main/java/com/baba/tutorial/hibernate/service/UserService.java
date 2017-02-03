package com.baba.tutorial.hibernate.service;

import com.baba.tutorial.hibernate.domain.User;

public interface UserService {

	public void createUser(User user);

	public void deleteUser(Integer userId);

	public void updateUser(User user);

	public User getUser(Integer userId);

}
