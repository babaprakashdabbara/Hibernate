package com.baba.tutorial.hibernate.domain;

import javax.persistence.*;

/**
 * Created by Babaprakash Dabbara on 11-02-2017.
 */
@Entity
@Table(name = "MARKET")
public class Market {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MARKET_ID")
    private Long marketId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumns({@JoinColumn(name = "CURRENCY_NAME", referencedColumnName = "NAME"),
                  @JoinColumn(name = "COUNTRY_NAME", referencedColumnName = "COUNTRY_NAME")})
    private Currency currency;

    @Column(name = "MARKET_NAME")
    private String marketName;

    public Long getMarketId() {
        return marketId;
    }

    public void setMarketId(Long marketId) {
        this.marketId = marketId;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }
}
