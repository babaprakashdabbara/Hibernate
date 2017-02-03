package com.baba.tutorial.hibernate;

import java.util.Date;

import org.hibernate.Session;

import com.baba.tutorial.hibernate.domain.TimeTest;
import com.baba.tutorial.hibernate.util.HibernateUtil;

public class TemporalTest {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(new TimeTest(new Date()));
		session.getTransaction().commit();
		session.close();
	}
}
