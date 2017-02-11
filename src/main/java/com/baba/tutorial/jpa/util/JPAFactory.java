package com.baba.tutorial.jpa.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Babaprakash Dabbara on 11-02-2017.
 */
public final class JPAFactory {

    private JPAFactory() {

    }

    public static EntityManagerFactory getEntityManagerFactory() {
        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
        return entityManagerFactory;
    }
}
