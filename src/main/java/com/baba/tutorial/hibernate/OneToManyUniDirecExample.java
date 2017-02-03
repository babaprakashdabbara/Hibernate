package com.baba.tutorial.hibernate;

import java.math.BigDecimal;

import java.util.Date;
import java.util.Random;

import org.hibernate.Session;

import com.baba.tutorial.hibernate.domain.Account;
import com.baba.tutorial.hibernate.util.HibernateUtil;

public class OneToManyUniDirecExample {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		Account account = new Account();
		account.setAccountId(new Random().nextLong());
		account.setCloseDate(new Date());
		account.setCreatedBy("Baba");
		account.setCreatedDate(new Date());
		account.setCurrentBalance(new BigDecimal(123));
		account.setInitialBalance(new BigDecimal(0));
		account.setLastUpdatedBy("Baba");
		account.setLastUpdatedDate(new Date());
		account.setName("Babaprakash");
		account.setOpenDate(new Date());

		// Transaction tr

		session.save(account);
		session.getTransaction().begin();
		session.getTransaction().commit();
		session.close();
	}

}
