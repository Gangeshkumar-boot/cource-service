package com.test.courceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CourceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourceServiceApplication.class, args);
	}

}
