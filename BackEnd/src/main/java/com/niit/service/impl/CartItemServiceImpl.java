package com.niit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.CartItemDAO;
import com.niit.model.Cart;
import com.niit.model.CartItem;
import com.niit.service.CartItemService;
import com.niit.service.CartService;
@Service
public class CartItemServiceImpl implements CartItemService {
	
	
	@Autowired
	private CartItemDAO cartItemDAO;
	
	public void addCartItem(CartItem cartItem){
		cartItemDAO.addCartItem(cartItem);
		
	}
	public void removeCartItem(CartItem cartItem){
		cartItemDAO.removeCartItem(cartItem);
	}
	public void removeAllCartItems(Cart cart){
		cartItemDAO.removeAllCartItems(cart);
	}
	
	public CartItem getCartItemById(int id){
		return cartItemDAO.getCartItemById(id);
		
	}
	public Cart getCartById(int cartId) {
		// TODO Auto-generated method stub
		return null;
	}
	public void update(Cart cart) {
		// TODO Auto-generated method stub
		
	}

}
