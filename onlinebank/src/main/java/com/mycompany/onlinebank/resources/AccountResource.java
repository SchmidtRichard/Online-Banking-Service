/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.resources;

import com.mycompany.onlinebank.models.Account;
import com.mycompany.onlinebank.services.AccountService;
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

@Path("accounts")
public class AccountResource {
    
    AccountService accountService = new AccountService();
    
    //Below we add the functionality needed to create a new account in our bank
    @POST
    @Path("/createAccount")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Account createAccount(Account account){
        return accountService.createAccount(account);
    }
    
    //Below we add the functionality needed to get all the accounts registered in our bank, it maps
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Account>getAllAccounts(){
        return accountService.getAllAccounts();
    }
    
    //Below we add the functionality needed to get an account by its ID
    @GET
    @Path("/getAccount/{accountId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Account getAccount(@PathParam("accountId") int id){
        return accountService.getAccontById(id);
    }
    
    //Below we add the functionality needed to update an account by its ID
    @PUT
    @Path("/updateAccount/{accountId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Account updateAccount(@PathParam("accountId") int id, Account account){
        return accountService.accountUpdateById(id, account);
    }
    
    //Below we add the functionality to delete an account by its ID
    @DELETE
    @Path("/deleteAccount/{accountId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Account deleteAccount(@PathParam("accountId") int id){
        return accountService.accountDeelteById(id);
    }
    
    //Below we add the functionality to access the transactions layer of the project
    @Path("/getAccount/{accountId}/transactions")
    public TransactionResource getTransactionResource(){
        
        System.out.println("____________________________________________________");
        System.out.println("Getting the bank transactions. Loading...");
        System.out.println("____________________________________________________");
        
        return new TransactionResource();
    }

}
