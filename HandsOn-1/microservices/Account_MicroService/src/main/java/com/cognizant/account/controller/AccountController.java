package com.cognizant.account.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.AccountMicroServiceApplication;

@RestController
public class AccountController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AccountMicroServiceApplication.class);

	@GetMapping("/accounts/{number}")
	public String getAccountDetails() {
		LOGGER.info("AccountController getAccountDetails() START");
		LOGGER.info("AccountController getAccountDetails() END");
		return " { number: \"00987987973432\", type: \"savings\", balance: 234343 } ";
	}
}
