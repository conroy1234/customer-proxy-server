package com.customer.proxi.server.profy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.customer.proxi.server.model.Customer;

@FeignClient(name="customer-service")
public interface CustomerProfy {

	@GetMapping(path="customer/id/{id}")
	public Customer findByFirstAndLastName(@PathVariable long id);
}
