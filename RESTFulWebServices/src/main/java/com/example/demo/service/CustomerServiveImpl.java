package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.example.demo.model.*;

@Component
public class CustomerServiveImpl implements CustomerService {
 
 private static List<Customer> customers = new ArrayList<>();
 
 static {
  Customer jack1 = new Customer(1, "Bhuvaneshwar", "admin@cashapona.com", "This is Bhuvaneshwar");
  Customer jack2 = new Customer(2, "Ravi Kiran", "support@cashapona.com", "This is Ravi Kiran");
  Customer jack3 = new Customer(3, "Bhargav Reddy", "test@cashapona.com", "This is a Bhargav Reddy");
  
  customers.add(jack1);
  customers.add(jack2);
  customers.add(jack3);
 }

 @Override
 public List<Customer> getAllCustomer() {
  return customers;
 }

 @Override
 public Customer getCustomerById(int id) {
  for(Customer customer : customers) {
   if(customer.getId() == id) {
    return customer;
   }
  }
  return null;
 }

 @Override
 public Customer addCustomer(Customer customer) {
  Random random = new Random();
  int nextId = random.nextInt(1000) + 10;
  
  customer.setId(nextId);
  customers.add(customer);
  
  return customer;
 }

 @Override
 public void updateCustomer(Customer customer) {
  for(Customer oldCustomer : customers) {
   if(oldCustomer.getId() == customer.getId()) {
    oldCustomer.setName(customer.getName());
    oldCustomer.setEmail(customer.getEmail());
    oldCustomer.setDescription(customer.getDescription());
   }
  }
 }

 @Override
 public void deleteCustomer(int id) {
  for(Customer c : customers) {
   if(c.getId() == id) {
    customers.remove(c);
    break;
   }
  }
 }

}
