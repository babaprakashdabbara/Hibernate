package com.baba.tutorial.hibernate;

import java.math.BigDecimal;

import java.util.Date;
import java.util.Random;

import org.hibernate.Session;

import com.baba.tutorial.hibernate.domain.Account;
import com.baba.tutorial.hibernate.domain.Transaction;
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

		Transaction transaction1 = createNewBeltPurchase();
		Transaction transaction2 = createShoePurchase();

		account.getTransactions().add(transaction1);
		account.getTransactions().add(transaction2);

		session.save(account);
		session.getTransaction().begin();
		session.getTransaction().commit();
		session.close();
	}

	private static Transaction createNewBeltPurchase() {
		Transaction beltPurchase = new Transaction();
		beltPurchase.setTitle("SomeThing");
		beltPurchase.setAmount(new BigDecimal("50.00"));
		beltPurchase.setClosingBalance(new BigDecimal("0.00"));
		beltPurchase.setCreatedBy("Kevin Bowersox");
		beltPurchase.setCreatedDate(new Date());
		beltPurchase.setInitialBalance(new BigDecimal("0.00"));
		beltPurchase.setLastUpdatedBy("Kevin Bowersox");
		beltPurchase.setLastUpdatedDate(new Date());
		beltPurchase.setNotes("New Dress Belt");
		beltPurchase.setTransactionType("Debit");
		return beltPurchase;
	}

	private static Transaction createShoePurchase() {
		Transaction shoePurchase = new Transaction();
		shoePurchase.setTitle("SomeThing");
		shoePurchase.setAmount(new BigDecimal("100.00"));
		shoePurchase.setClosingBalance(new BigDecimal("0.00"));
		shoePurchase.setCreatedBy("Kevin Bowersox");
		shoePurchase.setCreatedDate(new Date());
		shoePurchase.setInitialBalance(new BigDecimal("0.00"));
		shoePurchase.setLastUpdatedBy("Kevin Bowersox");
		shoePurchase.setLastUpdatedDate(new Date());
		shoePurchase.setNotes("Nice Pair of Shoes");
		shoePurchase.setTransactionType("Debit");
		return shoePurchase;
	}

}
