/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.services;

import com.mycompany.onlinebank.database.Database;
import com.mycompany.onlinebank.models.Transaction;
import java.util.Date;
import java.util.List;

/**
 * @author Boris F.
 * @author Richard Schmidt de Almeida - x16126602
 * @author Yamina Santillan Rodriguez - x16110561
 */

public class TransactionService {
    
    Database database = new Database();
    private List<Transaction> list = database.getTransactionsDB();

    public TransactionService() {
    }
    
    public Transaction transactionCreate(Transaction transaction){
        transaction.setId(list.size() + 1);
        transaction.setDateOfTransaction(new Date());
        list.add(transaction);
        
        System.out.println("201 - Resource created with the path: /transactions/" + String.valueOf(transaction.getId()));
        
        return transaction;
    }
    
    public List<Transaction> getAllTransactions(){
        return list;
    }
    
    public Transaction getTransactionById(int id){
        return list.get(id - 1);
    }
    
    public Transaction transactionDeleteById(int id) {
        return list.remove(id - 1);
    }
    
    public Transaction transactionUpdateById(int id){
        Transaction transaction = list.get(id - 1);
        transaction.setTypeTransaction("Debit Account");
        transaction.setBalanceAvailable(174.99);
        
        return transaction;
    }
    
}
