package com.customer.proxi.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CustomerProxyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerProxyServerApplication.class, args);
	}

}
