/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.services;

import com.mycompany.onlinebank.database.Database;
import com.mycompany.onlinebank.models.Customer;
import java.util.List;
import java.util.Random;

/**
 * @author Boris F.
 * @author Richard Schmidt de Almeida - x16126602
 * @author Yamina Santillan Rodriguez - x16110561
 */

public class CustomerService {
    
    Database database = new Database();
    private List<Customer> list = database.getCustomersDB();
    
        public CustomerService() {
    }
        
    public Customer createCustomer(Customer customer){
        Customer createNewCustomer = new Customer();
        createNewCustomer.setId(list.size() + 1);
        createNewCustomer.setPin(3000 + new Random().nextInt(9999));
        createNewCustomer.setNameCustomer(customer.getNameCustomer());
        createNewCustomer.setAddress(customer.getAddress());
        createNewCustomer.setEmail(customer.getEmail());
        list.add(createNewCustomer);
        
        System.out.println("201 - Resource created with the path: /customers/" + String.valueOf(createNewCustomer.getId()));
        
        return createNewCustomer;
    }
    
    public List<Customer> getAllCustomers(){
        return list;
    }
    
    public Customer getCustomerById(int id){
        return list.get(id - 1);
    }
    
    public Customer customerDeleteById(int id){
        return list.remove(id - 1);
    }
    
    public Customer customerUpdateCustomerById(int id, Customer customer){
        Customer updatedCustomer = list.get(id - 1);
        
        if (customer.getAddress() == null) {
            updatedCustomer.setAddress(updatedCustomer.getAddress());
        } else {
            updatedCustomer.setAddress(customer.getAddress());
        }
        
        if (customer.getEmail() == null) {
            updatedCustomer.setEmail(updatedCustomer.getEmail());
        } else {
            updatedCustomer.setEmail(customer.getEmail());
        }
        
        return updatedCustomer;
    }
    
}
