package com.cognizant.authentication.models;

import lombok.AllArgsConstructor;
import lombok.Data;

// A (temporary) class represent the user saved in the database.

@Data
@AllArgsConstructor
public class AppUser {
	
	private Integer id;
	private String username, password;
	private String role;
}