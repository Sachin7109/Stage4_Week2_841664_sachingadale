package com.cognizant.favourites;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.cognizant.ExchangeServiceProxy")
@EnableCircuitBreaker
@EnableHystrixDashboard
public class FavouriteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FavouriteServiceApplication.class, args);
	}

}
