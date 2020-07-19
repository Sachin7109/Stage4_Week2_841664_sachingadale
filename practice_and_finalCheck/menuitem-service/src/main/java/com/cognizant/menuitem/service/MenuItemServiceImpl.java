package com.cognizant.menuitem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.menuitem.dao.MenuItemDao;
import com.cognizant.menuitem.model.MenuItem;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MenuItemServiceImpl implements MenuItemService {
	
	
	@Autowired
	MenuItemDao menuItemDao;
	
	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		log.info("START");
		List<MenuItem> menuItemListAdmin = menuItemDao.getMenuItemListAdmin();
		log.debug("MenuItemListAdmin: {}",menuItemListAdmin);
		log.info("END");
		return menuItemListAdmin;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		log.info("START");
		List<MenuItem> menuItemListCustomer = menuItemDao.getMenuItemListCustomer();
		log.debug("MenuItemListCustomer: {}",menuItemListCustomer);
		log.info("END");
		return menuItemListCustomer;
	}

	@Override
	public void modifyMenuItem(int menuItemId, MenuItem menuItem) {
		log.info("START");
		menuItemDao.modifyMenuItem(menuItemId, menuItem);
		log.info("END");
	}

	@Override
	public MenuItem getMenuItem(int menuItemId) {
		log.info("START");
		MenuItem menuItem = menuItemDao.getMenuItem(menuItemId);
		log.info("END");
		return menuItem;
	}

	@Override
	public void addMenuItem(MenuItem menuItem) {
		log.info("START");
		menuItemDao.addMenuItem(menuItem);
		log.info("END");
	}

	@Override
	public void removeMenuItem(int menuItemId) {
		log.info("START");
		menuItemDao.removeMenuItem(menuItemId);
		log.info("END");
		
	}

	
}
