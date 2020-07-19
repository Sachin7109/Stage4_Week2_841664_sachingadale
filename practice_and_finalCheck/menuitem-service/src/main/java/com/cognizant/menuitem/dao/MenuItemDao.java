package com.cognizant.menuitem.dao;

import java.util.List;

import com.cognizant.menuitem.model.MenuItem;

public interface MenuItemDao {

	public List<MenuItem> getMenuItemListAdmin();

	public List<MenuItem> getMenuItemListCustomer();

	public void modifyMenuItem(int menuItemId,MenuItem menuItem);

	public MenuItem getMenuItem(int menuItemId);
	
	public void addMenuItem(MenuItem menuItem);
	
	public void removeMenuItem(int menuItemId);
}
