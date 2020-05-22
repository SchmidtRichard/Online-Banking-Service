/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.database;

import com.mycompany.onlinebank.models.Account;
import com.mycompany.onlinebank.models.Customer;
import com.mycompany.onlinebank.models.Transaction;
import java.util.ArrayList;

import java.util.List;

/**
 * @author Boris F.
 * @author Richard Schmidt de Almeida - x16126602
 * @author Yamina Santillan Rodriguez - x16110561
 */

public class Database {
     
    public static List<Customer> customerDB = new ArrayList<>();
    public static List<Account> accountDB = new ArrayList<>();
    public static List<Transaction> transactionDB = new ArrayList<>();
    
    public static boolean init = true;    

    public Database() {
        
        if (init) {    
            
        //account
        Account a1 = new Account (1,15458, 75465, "Rihanna", "Current", 70.00, transactionDB);
        Account a2 = new Account (2,25458, 85465, "Madonna", "Current", 80.00, transactionDB);
        Account a3 = new Account (3,35458, 95465, "Arianna", "Savings", 90.00, transactionDB);
        
        accountDB.add(a1);
        accountDB.add(a2);
        accountDB.add(a3); 
        
        Customer c1 = new Customer (1,20030, "Rihanna B.", "Jmajka Street", "rihanna@gmail.com", accountDB);
        Customer c2 = new Customer (2,20030, "Madonna M", "London Street", "madonna@gmail.com", accountDB);
        Customer c3 = new Customer (3,20030, "Grande A", "New York Street", "ariana.grande@gamil.com", accountDB);
        
        customerDB.add(c1);
        customerDB.add(c2);
        customerDB.add(c3); 
        
        Transaction t1 = new Transaction (1,"lodge", 333.00, 168.00);
        Transaction t2 = new Transaction (2,"withdraw",90.00, 525.00);
        Transaction t3 = new Transaction (3,"lodge",7540.00, 5150.00);
        
        
        transactionDB.add(t1);
        transactionDB.add(t2);
        transactionDB.add(t3); 
        

        init = false;
     }
        
        
        
        
    }
    
    
    public List<Customer> getCustomersDB(){
        return customerDB;
    }
    
    public List<Transaction> getTransactionsDB(){
        return transactionDB;
    }
    
    public List<Account> getAccountsDB(){
        return accountDB;
    }

}
