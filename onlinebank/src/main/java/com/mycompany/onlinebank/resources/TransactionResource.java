/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.resources;

import com.mycompany.onlinebank.models.Transaction;
import com.mycompany.onlinebank.services.TransactionService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Boris F.
 * @author Richard Schmidt de Almeida - x16126602
 * @author Yamina Santillan Rodriguez - x16110561
 */

@Path("/transactions")
public class TransactionResource {
    
    TransactionService transactionService = new TransactionService();
    
    //Below we add functionality to create a new transaction to the bank
    @POST
    @Path("/createTransaction")
    @Consumes(MediaType.APPLICATION_JSON)    
    @Produces(MediaType.APPLICATION_JSON)    
    public Transaction createTransaction(Transaction transaction) {
        
        return transactionService.transactionCreate(transaction);

    }
    
    //Below we add the functionality needed to get all the transactions registered in our bank, it maps
    @GET    
    @Produces(MediaType.APPLICATION_JSON)    
    public List<Transaction> getAllTransactions() {        
        return transactionService.getAllTransactions();
    }

    //Below we add the functionality needed to get a transaction by its ID
    @GET    
    @Path("/getTransaction/{transactionId}")
    @Produces(MediaType.APPLICATION_JSON)    
    public Transaction getTransaction(@PathParam("transactionId") int id) {        
        return transactionService.getTransactionById(id);
    }
    
    //Below we add the functionality needed to update a transaction by its ID
    @PUT    
    @Path("/updateteTransaction/{transactionId}")
    @Produces(MediaType.APPLICATION_JSON)    
    public Transaction updateTransaction(@PathParam("transactionId") int id) {        
        return transactionService.transactionUpdateById(id);
    }
    
    //Below we add the functionality to delete an transaction by its ID
    @DELETE    
    @Path("/deleteTransaction/{transactionId}")
    @Produces(MediaType.APPLICATION_JSON)    
    public Transaction deleteTransaction(@PathParam("transactionId") int id) {        
        return transactionService.transactionDeleteById(id);
    }
    
}
