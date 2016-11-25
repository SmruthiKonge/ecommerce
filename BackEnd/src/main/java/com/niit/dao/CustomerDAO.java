package com.niit.dao;

import java.util.List;

import com.niit.model.Customer;

public interface CustomerDAO {

	void addCustomer(Customer customer);

	Customer getCustomerById(int customerId);

	List<Customer> getAllCustomers();
	
	Customer getCustomerByUsername (String username);

}
