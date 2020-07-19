package com.cognizant.authentication.models;

import lombok.Getter;
import lombok.Setter;

//A (temporary) class just to represent the user credentials
@Getter 
@Setter
public class UserCredentials {
	private String username, password;
}