package com.cognizant.menuitem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MenuitemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenuitemServiceApplication.class, args);
	}

}
