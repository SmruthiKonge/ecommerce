 package com.niit.service;

import com.niit.model.CustomerOrder;

public interface CustomerOrderService {
	
	
	void addCustomerOrder(CustomerOrder customerOrder);
	
	double getCustomerOrderGrandTotal(int cartId);

}
