package com.cognizant.loan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.LoanMicroServiceApplication;

@RestController
public class LoanController {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoanMicroServiceApplication.class);

	@GetMapping("/loans/{number}")
	public String getLoanDetails() {
		LOGGER.info("LoanController getLoanDetails() START");
		LOGGER.info("LoanController getLoanDetails() END");
		return " { number: \"H00987987972342\", type: \"car\", loan: 400000, emi: 3258, tenure: 18 } ";
	}
}
