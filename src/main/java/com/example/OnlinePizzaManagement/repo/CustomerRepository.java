package com.example.OnlinePizzaManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.OnlinePizzaManagement.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>
{

	//Customer viewCustomer(Integer customerId);

	//Customer addCustomer(Customer customer);

   // public Customer updateCustomer(Customer customer);
    //public Customer deleteCustomer(Integer customerId);
     //public List<Customer> getAllCustomers();
     // Customer viewCoustomer(Integer customerId) throws CustomerIdNotFoundException;
      
}
