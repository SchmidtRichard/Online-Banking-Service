
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.resources;

import com.mycompany.onlinebank.models.Customer;
import com.mycompany.onlinebank.services.CustomerService;
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

@Path("/customers")
public class CustomerResource {    
    
    CustomerService customerService = new CustomerService();

    //Below we add functionality to create a new customer to the bank
    @POST
    @Path("/createCustomer")    
    @Consumes(MediaType.APPLICATION_JSON)    
    @Produces(MediaType.APPLICATION_JSON)    
    public Customer createCustomer(Customer customer) {
        
        return customerService.createCustomer(customer);
    }
    
    
    //Below we add the functionality needed to get all the customers registered in our bank, it maps
    @GET    
    @Produces(MediaType.APPLICATION_JSON)    
    public List<Customer> getAllCustomers() {        
        return customerService.getAllCustomers();
    }
    
    //Below we add the functionality needed to get a customer by its ID
    @GET
    @Path("/getCustomer/{customerId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomer(@PathParam("customerId") int id) {
        
        return customerService.getCustomerById(id);
    }

    //Below we add the functionality needed to update a customer by its ID
    @PUT
    @Path("/updateCustomer/{customerId}")
    @Consumes(MediaType.APPLICATION_JSON)    
    @Produces(MediaType.APPLICATION_JSON)
    public Customer updateCustomer(@PathParam("customerId") int id, Customer customer) {
        return customerService.customerUpdateCustomerById(id, customer);
    }

    //Below we add the functionality to delete an customer by its ID
    @DELETE    
    @Path("/deleteCustomer/{customerId}")    
    @Produces(MediaType.APPLICATION_JSON)    
    public Customer deleteCustomer(@PathParam("customerId") int id) {        
        return customerService.customerDeleteById(id);
    }

    //Below we add the functionality to access the accounts layer of the project
    @Path("/getCustomer/{customerId}/accounts")
        public AccountResource getAccountResource() {
        
        System.out.println("____________________________________________________");
        System.out.println("Getting the bank accounts. Loading...");
        System.out.println("____________________________________________________");
        
        return new AccountResource();
    }
    
}
