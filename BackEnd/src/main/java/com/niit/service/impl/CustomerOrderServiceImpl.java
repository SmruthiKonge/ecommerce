package com.niit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.CustomerOrderDAO;
import com.niit.model.Cart;
import com.niit.model.CartItem;
import com.niit.model.CustomerOrder;
import com.niit.service.CartService;
import com.niit.service.CustomerOrderService;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {
	
	@Autowired
	private CustomerOrderDAO customerOrderDAO;
	
	@Autowired
	private CartService cartService;
	
	
	public void addCustomerOrder(CustomerOrder customerOrder){
		customerOrderDAO.addCustomerOrder(customerOrder);
	}
	
	public double getCustomerOrderGrandTotal(int cartId){
		double grandTotal=0;
		Cart cart = cartService.getCartById(cartId);
		List<CartItem> cartItems=cart.getCartItems();
		
		for(CartItem item:cartItems){
			grandTotal+=item.getTotalPrice();
		}
		 return grandTotal;
	}

}
