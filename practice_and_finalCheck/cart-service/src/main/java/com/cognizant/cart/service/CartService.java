package com.cognizant.cart.service;

import java.util.ArrayList;

import com.cognizant.cart.exception.MenuItemNotFoundException;
import com.cognizant.cart.model.MenuItem;

public interface CartService {

	//to add item in given user cart
			void addCartItem(int userId, int menuItemId) throws MenuItemNotFoundException;

			//fetch all items in given user cart
			ArrayList<MenuItem> getAllCartItems(int userId);

			//delete item from given user and cart
			void deleteCartItem(int userId, int menuItemId);
}
