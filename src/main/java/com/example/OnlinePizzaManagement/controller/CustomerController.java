package com.example.OnlinePizzaManagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


import com.example.OnlinePizzaManagement.entity.Customer;
import com.example.OnlinePizzaManagement.exception.CustomerIdNotFoundException;
import com.example.OnlinePizzaManagement.service.ICustomerService;

@RestController
@RequestMapping("Customers")
public class CustomerController

{
	@Autowired
    private ICustomerService customerService;
	
	@PostMapping("/add")
	public ResponseEntity<Customer> addCustomer(@Valid @RequestBody Customer customer)
	{
		return new ResponseEntity<Customer>(customerService.addCustomer(customer),HttpStatus.CREATED);
	
	}
	
	@PutMapping("/{customerId}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable Integer customerId,Customer customer)
	{
		return new ResponseEntity<Customer>(customerService.updateCustomer(customerId, customer),HttpStatus.OK);
		
	}
	
	
	@DeleteMapping("/{customerId}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer customerId) throws CustomerIdNotFoundException
	{
        customerService.deleteCustomer(customerId);
		String msg="Delete customer with ID:"+customerId+"is deleted successfully";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		
		
		
		
		
	
	
	@GetMapping("/allCustomers")
	public List<Customer> viewCustomers()
	{
       return customerService.viewCustomers();
	}
	

	@GetMapping(value="/{customerId}")
	public ResponseEntity<Customer> viewCustomer(@PathVariable Integer customerId) throws CustomerIdNotFoundException
	{
		return new ResponseEntity<Customer>(customerService.viewCustomer(customerId),HttpStatus.OK);
		
	}
}
