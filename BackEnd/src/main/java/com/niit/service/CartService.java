package com.niit.service;

import com.niit.model.Cart;

public interface CartService {

	
	Cart getCartById(int cartId);
	
	void update(Cart cart);
}
