/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.models;

import java.util.List;

/**
 * @author Boris F.
 * @author Richard Schmidt de Almeida - x16126602
 * @author Yamina Santillan Rodriguez - x16110561
 */
public class Account {
    
    private int id;
    private int sortCode;
    private int accountNum;
    private String nameCustomer;
    private String typeAccount;
    private double balanceAvailable;
    private List<Transaction> transactions;

    public Account() {
    }

    public Account(int id, int sortCode, int accountNum, String nameCustomer, String typeAccount, double balanceAvailable, List<Transaction> transactions) {
        this.id = id;
        this.sortCode = sortCode;
        this.accountNum = accountNum;
        this.nameCustomer = nameCustomer;
        this.typeAccount = typeAccount;
        this.balanceAvailable = balanceAvailable;
        this.transactions = transactions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSortCode() {
        return sortCode;
    }

    public void setSortCode(int sortCode) {
        this.sortCode = sortCode;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public double getBalanceAvailable() {
        return balanceAvailable;
    }

    public void setBalanceAvailable(double balanceAvailable) {
        this.balanceAvailable = balanceAvailable;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    
    
}



