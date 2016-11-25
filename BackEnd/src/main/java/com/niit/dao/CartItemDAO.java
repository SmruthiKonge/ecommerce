package com.niit.dao;

import com.niit.model.Cart;
import com.niit.model.CartItem;

public interface CartItemDAO {

	void addCartItem(CartItem cartItem);

	void removeCartItem(CartItem cartItem);

	void removeAllCartItems(Cart cart);

	CartItem getCartItemById (int id);
}
