package com.example.OnlinePizzaManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.OnlinePizzaManagement.entity.Customer;
import com.example.OnlinePizzaManagement.exception.CustomerIdNotFoundException;
import com.example.OnlinePizzaManagement.repo.CustomerRepository;

@Service
public class CustomerServiceImp implements ICustomerService 
{
     @Autowired
     private CustomerRepository customerRepo;
     /*
     @Override
 	public Customer save(Customer customer)
 	{
 			return customerRepo.save(customer);
 	}
 	*/
/*
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}
	*/

	@Override
	public Customer updateCustomer(Integer customerId, Customer customer) {
		Customer existingCustomer=customerRepo.findById(customerId).get();
		existingCustomer.setCustomerAddress(customer.getCustomerAddress());
		existingCustomer.setCustomerEmail(customer.getCustomerEmail());
		existingCustomer.setCustomerMobile(customer.getCustomerMobile());
		existingCustomer.setUserName(customer.getUserName());
		existingCustomer.setCustomerName(customer.getCustomerName());
		existingCustomer.setPassword(customer.getPassword());
		customerRepo.save(existingCustomer);
		return null;
	}

	@Override
	public Customer deleteCustomer(Integer customerId) throws CustomerIdNotFoundException
	{
		 Customer customer=viewCustomer(customerId);
		 customerRepo.deleteById(customer.getCustomerId());
		return customer;
		
	}

	@Override
	public List<Customer> viewCustomers() 
	{
		return customerRepo.findAll();
	}
@Override
public Customer addCustomer(Customer customer) 
{
	
	return customerRepo.save(customer);
}

@Override
public Customer viewCustomer(Integer customerId) throws CustomerIdNotFoundException
{
	Optional<Customer> opt=customerRepo.findById(customerId);
	if(opt.isPresent())
	{
		Customer customer=opt.get();
		return customer;
	}
	else
	{
		throw new CustomerIdNotFoundException("Customer with given ID:"+customerId+" is not available");
	}
		
}
     
     
}

