package com.hui.service;

import com.hui.entity.Customer;

public interface CustomerService {
	public int save(Customer customer);
	public int update(Customer customer);
	public Customer query(int id);
	public int delete(int id);
}
