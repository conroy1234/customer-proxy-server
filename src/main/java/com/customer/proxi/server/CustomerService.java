package com.customer.proxi.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.customer.proxi.server.model.Customer;
import com.customer.proxi.server.profy.CustomerProfy;

@RestController
public class CustomerService {
	
	@Autowired
	private CustomerProfy customerProfy;
	
	@GetMapping("proxy/customer/id/{id}")
	public Customer findCustomer(@PathVariable long id) {
		Customer customer = customerProfy.findByFirstAndLastName(id);
		return new Customer(id,customer.getFirstName(),customer.getLastName(),customer.getAddress(),customer.getPostCode());
		
	}

}
