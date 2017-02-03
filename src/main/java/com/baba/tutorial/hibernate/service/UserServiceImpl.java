package com.baba.tutorial.hibernate.service;

import org.hibernate.Session;

import com.baba.tutorial.hibernate.domain.User;

public class UserServiceImpl implements UserService {

	private Session session;

	public UserServiceImpl(Session session) {
		this.session = session;
	}

	@Override
	public void createUser(User user) {
		session.getTransaction().begin();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUser(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
