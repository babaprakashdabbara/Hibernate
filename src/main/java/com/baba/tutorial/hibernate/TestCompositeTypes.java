package com.baba.tutorial.hibernate;

import java.util.Date;

import org.hibernate.Session;

import com.baba.tutorial.hibernate.domain.Address;
import com.baba.tutorial.hibernate.domain.Bank;
import com.baba.tutorial.hibernate.service.BankService;
import com.baba.tutorial.hibernate.service.BankServiceImpl;
import com.baba.tutorial.hibernate.util.HibernateUtil;

public class TestCompositeTypes {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		BankService bankService = new BankServiceImpl(session);
		Bank bank = new Bank();
		Address address = new Address();
		address.setCity("Bangalore");
		bank.setName("HDFC Bank");
		bank.setCreatedBy("Babaprakash");
		bank.setCreatedDate(new Date());
		address.setAddressLine1("RT Nagar Branch");
		address.setAddressLine2("Bangalore");
		bank.setBankId(123L);
		bank.setLastUpdatedDate(new Date());
		bank.setLastUpdatedBy("Baabprakash");
		address.setState("K");
		address.setZipCode("4");
		bank.setIsInternational(1);
		bank.getContact().add("Bank1");
		bank.getContact().add("Bank2");
		bankService.saveBank(bank);
	}
}
