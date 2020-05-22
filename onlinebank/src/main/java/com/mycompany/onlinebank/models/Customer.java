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

public class Customer {
    
    private int id;
    private int pin;
    private String nameCustomer;
    private String email;
    private String address;
    private List<Account> accounts;

    public Customer() {
    }

    public Customer(int id, int pin, String nameCustomer, String email, String address, List<Account> accounts) {
        this.id = id;
        this.pin = pin;
        this.nameCustomer = nameCustomer;
        this.email = email;
        this.address = address;
        this.accounts = accounts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
    
    
    
    
}


