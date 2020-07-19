package com.cognizant.cart.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.cart.dao.CartDao;
import com.cognizant.cart.exception.MenuItemNotFoundException;
import com.cognizant.cart.model.MenuItem;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	CartDao cartDao;
	
	@Override
	public void addCartItem(int userId, int menuItemId) throws MenuItemNotFoundException {
		
		cartDao.addCartItem(userId, menuItemId);
		
	}

	@Override
	public ArrayList<MenuItem> getAllCartItems(int userId) {
		
		return cartDao.getAllCartItems(userId);
	}

	@Override
	public void deleteCartItem(int userId, int menuItemId) {
		
		cartDao.deleteCartItem(userId, menuItemId);
	}

}
