package com.baba.tutorial.hibernate;

import com.baba.tutorial.hibernate.domain.Bank;
import com.baba.tutorial.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by Babaprakash Dabbara on 05-02-2017.
 */
public class HibernateAPI {

    public static void main(String[] args) {

        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        session.getTransaction().begin();

        Bank bank = (Bank)session.get(Bank.class, 1L);
        System.out.println(bank.getName());
        bank.setName("HDFC");
        session.getTransaction().commit();
        System.out.println(bank.getName());

    }
}
