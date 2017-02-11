package com.baba.tutorial.hibernate;

import com.baba.tutorial.hibernate.domain.Currency;
import com.baba.tutorial.hibernate.domain.Market;
import com.baba.tutorial.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by Babaprakash Dabbara on 11-02-2017.
 */
public class CompoundJoinColumnsExample {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Market market = new Market();
        market.setMarketName("Indian Market");
        Currency currency = new Currency();
        currency.setName("ttest");
        currency.setCountryName("India");
        currency.setSymbol("r");
        market.setCurrency(currency);

        session.persist(market);
        session.getTransaction().commit();
        session.close();
    }
}
