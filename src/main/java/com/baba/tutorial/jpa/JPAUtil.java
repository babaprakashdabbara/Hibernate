package com.baba.tutorial.jpa;

import com.baba.tutorial.jpa.domain.Employee;
import com.baba.tutorial.jpa.util.JPAFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

/**
 * Created by Babaprakash Dabbara on 05-02-2017.
 */
public class JPAUtil {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = null;

		EntityManager entityManager = null;

		EntityTransaction entityTransaction = null;

		try {
			entityManagerFactory = JPAFactory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(createEmployee());
			entityTransaction.commit();
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}
	}

	private static Employee createEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeId(123);
		employee.setEmployeeName("Babaprakash");
		employee.setDesignation("Senior Consultant");
		return employee;
	}
}
