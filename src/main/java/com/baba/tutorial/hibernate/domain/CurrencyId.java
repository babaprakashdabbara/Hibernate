package com.baba.tutorial.hibernate.domain;

import java.io.Serializable;

/**
 * Created by Babaprakash Dabbara on 09-02-2017.
 */
@SuppressWarnings("serial")
public class CurrencyId implements Serializable {

    private String name;

    private String countryName;

    public CurrencyId() {
    }

    public CurrencyId(String name, String countryName) {
        this.name = name;
        this.countryName = countryName;
    }

    public String getName() {
        return name;
    }

    public String getCountryName() {
        return countryName;
    }
}
