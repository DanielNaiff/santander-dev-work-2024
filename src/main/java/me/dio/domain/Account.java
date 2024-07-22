package me.dio.domain;

import java.math.BigDecimal;

public class Account {
    private Long id;
    private String number;
    private String agency;
    private BigDecimal balance;
    private BigDecimal getBalance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getGetBalance() {
        return getBalance;
    }

    public void setGetBalance(BigDecimal getBalance) {
        this.getBalance = getBalance;
    }
}
