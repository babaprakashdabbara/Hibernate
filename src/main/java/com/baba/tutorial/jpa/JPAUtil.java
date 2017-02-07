package com.baba.tutorial.jpa;

import com.baba.tutorial.hibernate.domain.Bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

/**
 * Created by Babaprakash Dabbara on 05-02-2017.
 */
public class JPAUtil {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = null;

		EntityManager entityManager = null;

		EntityTransaction entityTransaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			entityManager.persist(createBank());
			entityTransaction.commit();
			entityManager.close();
			entityManagerFactory.close();
		} finally {
		}
	}

	private static Bank createBank() {
		Bank bank = new Bank();
		bank.setName("First United Federal");
		bank.setCreatedBy("Kevin Bowersox");
		bank.setCreatedDate(new Date());
		bank.setLastUpdatedBy("Kevin Bowersox");
		bank.setLastUpdatedDate(new Date());
		return bank;
	}
}
