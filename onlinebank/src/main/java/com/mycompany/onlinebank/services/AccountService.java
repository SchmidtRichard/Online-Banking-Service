/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.services;

import com.mycompany.onlinebank.database.Database;
import com.mycompany.onlinebank.models.Account;
import java.util.List;



/**
 * @author Boris F.
 * @author Richard Schmidt de Almeida - x16126602
 * @author Yamina Santillan Rodriguez - x16110561
 */

public class AccountService {
    
    Database database = new Database();
    private List<Account> list = database.getAccountsDB();

    public AccountService() {
    }
    
    public Account createAccount(Account account){
        account.setId(list.size() + 1);
        account.setSortCode(1930938);
        account.setAccountNum(list.size() + 938949 + 1);
        account.setNameCustomer(account.getNameCustomer());
        account.setTypeAccount(account.getTypeAccount());
        list.add(account);
        
        System.out.println("201 - Resource created with the path: /accounts/create/" + String.valueOf(account.getId()));
        
        return account;
        
    }
    
    public List<Account> getAllAccounts(){
        return list;
    }
    
    public Account getAccontById(int id){
        return list.get(id - 1);
    }
    
    public Account accountUpdateById(int id, Account account){
        Account accountUpdate = list.get(id - 1);
        accountUpdate.setBalanceAvailable(account.getBalanceAvailable());
        return accountUpdate;
    }
    
    public Account accountDeelteById(int id){
        return list.remove(id - 1);
    }
}
    
    
    

