package com.hui.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hui.entity.Customer;
import com.hui.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/save")
	public int save(Customer customer) {
		return customerService.save(customer);
	}
	
	@RequestMapping("/update")
	public int update(Customer customer) {
		return customerService.update(customer);
	}
	
	@RequestMapping("/query")
	public Customer query(int id) {
		return customerService.query(id);
	}
	
	@RequestMapping("/delete")
	public int delete(int id) {
		return customerService.delete(id);
	}

}
