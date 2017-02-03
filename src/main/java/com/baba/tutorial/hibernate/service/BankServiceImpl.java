package com.baba.tutorial.hibernate.service;

import org.hibernate.Session;

import com.baba.tutorial.hibernate.domain.Bank;

public class BankServiceImpl implements BankService {

	private Session session;

	public BankServiceImpl(Session session) {
		super();
		this.session = session;
	}

	@Override
	public void saveBank(Bank bank) {
		session.getTransaction().begin();
		session.save(bank);
		session.getTransaction().commit();
		session.close();
	}
}
