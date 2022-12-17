package com.example.geteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GetewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetewayApplication.class, args);
	}

}
