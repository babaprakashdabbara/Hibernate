package com.baba.tutorial.hibernate;

import com.baba.tutorial.hibernate.domain.Currency;
import com.baba.tutorial.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by Babaprakash Dabbara on 09-02-2017.
 */
public class HibernateTest {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Currency currency = new Currency();
        currency.setName("ttest");
        currency.setCountryName("India");
        currency.setSymbol("r");
        session.save(currency);
        session.getTransaction().begin();
        session.getTransaction().commit();
        session.close();
    }
}
