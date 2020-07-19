package com.cognizant.menuitem.controller;

import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.menuitem.model.MenuItem;
import com.cognizant.menuitem.service.MenuItemService;

@RestController
@RequestMapping(value = "/menu-item")
public class MenuItemController {

	@Autowired
	MenuItemService menuItemService;

	// Method is used to fetch MenuItem List for Admin
	@GetMapping(value = "/admin", produces = MediaType.APPLICATION_JSON)
	public List<MenuItem> getMenuItemListAdmin() {
		return menuItemService.getMenuItemListAdmin();
	}

	// Method is used to fetch MenuItem List for Customer
	@GetMapping(value = "/customer", produces = MediaType.APPLICATION_JSON)
	public List<MenuItem> getMenuItemListCustomer() {

		return menuItemService.getMenuItemListCustomer();
	}

	// Method is used to modify MenuItem by MenuItem Id and accessible for Admin
	@PutMapping(value = "/admin/{menuItemId}")
	public void modifyMenuItem(@PathVariable @Valid int menuItemId, @RequestBody MenuItem menuItem) {
		menuItemService.modifyMenuItem(menuItemId, menuItem);
	}

	// Method is used to fetch MenuItem by MenuItem Id for Customer
	@GetMapping(value = "/customer/{menuItemId}", produces = MediaType.APPLICATION_JSON)
	public MenuItem getMenuItemCustomer(@PathVariable int menuItemId) {

		return menuItemService.getMenuItem(menuItemId);
	}

	// Method is used to fetch MenuItem by MenuItem Id for Admin
	@GetMapping(value = "/admin/{menuItemId}", produces = MediaType.APPLICATION_JSON)
	public MenuItem getMenuItemAdmin(@PathVariable int menuItemId) {

		return menuItemService.getMenuItem(menuItemId);
	}

	// Method is used to add MenuItem in Database and accessible for Admin
	@PostMapping(value = "/admin")
	public void addMenuItem(@RequestBody MenuItem menuItem) {
		menuItemService.addMenuItem(menuItem);
	}

	// Method is used to remove MenuItem from Database and accessible for Admin
	@DeleteMapping(value = "/admin/{menuItemId}")
	public void removeMenuItem(@PathVariable @Valid int menuItemId) {
		menuItemService.removeMenuItem(menuItemId);
	}
}
