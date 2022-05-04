package com.example.OnlinePizzaManagement.service;

import java.util.List;


import com.example.OnlinePizzaManagement.entity.Customer;
import com.example.OnlinePizzaManagement.exception.CustomerIdNotFoundException;


public interface ICustomerService 
{
	// public  Customer addCustomer(Customer customer);
	     public Customer updateCustomer(Integer customerId,Customer customer);
	     public Customer deleteCustomer(Integer customerId) throws CustomerIdNotFoundException;
	  //   public List<Customer> viewCustomers();
	      Customer viewCustomer(Integer customerId) throws CustomerIdNotFoundException;
	public	Customer addCustomer(Customer customer);
	public List<Customer> viewCustomers();      
}
