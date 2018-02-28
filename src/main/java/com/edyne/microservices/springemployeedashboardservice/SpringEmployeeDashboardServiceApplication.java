package com.edyne.microservices.springemployeedashboardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringEmployeeDashboardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmployeeDashboardServiceApplication.class, args);
	}
}
