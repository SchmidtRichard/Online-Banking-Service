/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.models;

import java.util.Date;

/**
 * @author Boris F.
 * @author Richard Schmidt de Almeida - x16126602
 * @author Yamina Santillan Rodriguez - x16110561
 */

public class Transaction {
    
    private int id;
    private String typeTransaction;
    private double balanceAvailable;
    private double amountOfTransaction;
    private Date DateOfTransaction;

    public Transaction() {
    }

    public Transaction(int id, String typeTransaction, double balanceAvailable, double amountOfTransaction) {
        this.id = id;
        this.typeTransaction = typeTransaction;
        this.balanceAvailable = balanceAvailable;
        this.amountOfTransaction = amountOfTransaction;
        this.DateOfTransaction = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(String typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public double getBalanceAvailable() {
        return balanceAvailable;
    }

    public void setBalanceAvailable(double balanceAvailable) {
        this.balanceAvailable = balanceAvailable;
    }

    public double getAmountOfTransaction() {
        return amountOfTransaction;
    }

    public void setAmountOfTransaction(double amountOfTransaction) {
        this.amountOfTransaction = amountOfTransaction;
    }
    public Date getDateOfTransaction() {
        return DateOfTransaction;
    }

    public void setDateOfTransaction(Date DateOfTransaction) {
        this.DateOfTransaction = DateOfTransaction;
    }
}


