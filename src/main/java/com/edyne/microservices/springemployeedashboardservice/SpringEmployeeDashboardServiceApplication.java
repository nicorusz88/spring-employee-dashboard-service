package com.edyne.microservices.springemployeedashboardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringEmployeeDashboardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmployeeDashboardServiceApplication.class, args);
	}
}
