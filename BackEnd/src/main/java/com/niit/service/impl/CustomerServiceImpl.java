package com.niit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.CustomerDAO;
import com.niit.model.Customer;
import com.niit.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	
	public void addCustomer(Customer customer){
		customerDAO.addCustomer(customer);
	}
	
	public Customer getCustomerById(int customerId){
		return customerDAO.getCustomerById(customerId);
	}
	
	public List<Customer>getAllCustomers(){
		return customerDAO.getAllCustomers();
	}
	
	public Customer getCustomerByUsername(String username){
		return customerDAO.getCustomerByUsername(username);
	}

}
