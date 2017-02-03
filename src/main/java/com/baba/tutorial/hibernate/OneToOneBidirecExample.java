package com.baba.tutorial.hibernate;

import java.util.Date;

import org.hibernate.Session;

import com.baba.tutorial.hibernate.domain.Address;
import com.baba.tutorial.hibernate.domain.Credential;
import com.baba.tutorial.hibernate.domain.User;
import com.baba.tutorial.hibernate.util.HibernateUtil;

/**
 * Created by Babaprakash Dabbara on 02-02-2017.
 */
public class OneToOneBidirecExample {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		Credential credential = getCredential();
		User user = getNewUser();
		user.setCredentail(credential);

		session.save(getCredential());
		session.getTransaction().commit();

		User object = (User) session.get(User.class, 500L);
		System.out.println(object.getFirstName());
		session.close();
	}

	private static User getNewUser() {
		User user = new User();
		user.setBirthDate(new Date());
		user.setCreatedBy("Babaprakash");
		user.setCreatedDate(new Date());
		user.setEmailAddress("babaprakash.dabbara@gmail.com");
		user.setFirstName("Babapraaksh");
		user.setLastName("Dabbara");
		user.setLastUpdatedBy("Baba");
		user.setLastUpdatedDate(new Date());
		Address address = getAddress1();
		Address address2 = getAddress2();
		user.getAddress().add(address);
		user.getAddress().add(address2);
		return user;
	}

	private static Credential getCredential() {
		Credential credential = new Credential();
		credential.setUser(getNewUser());
		credential.setUsername("Baba");
		credential.setPassword("123");
		return credential;
	}

	private static Address getAddress1() {
		Address address = new Address();
		address.setAddressLine1("Address Line1");
		address.setAddressLine2("addressLine2");
		address.setCity("bangalore");
		address.setState("KA");
		address.setZipCode("232");
		return address;
	}

	private static Address getAddress2() {
		Address address = new Address();
		address.setAddressLine1("Address Line2");
		address.setAddressLine2("addressLine3");
		address.setCity("bangalore1");
		address.setState("K2");
		address.setZipCode("233");
		return address;
	}

}
