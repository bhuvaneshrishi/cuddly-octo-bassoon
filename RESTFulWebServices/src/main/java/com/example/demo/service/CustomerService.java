package com.example.demo.service;

import java.util.List;

import com.example.demo.model.*;

public interface CustomerService {

 public List<Customer> getAllCustomer();
 
 public Customer getCustomerById(int id);
 
 public Customer addCustomer(Customer customer);
 
 public void updateCustomer(Customer customer);
 
 public void deleteCustomer(int id);
 
}
