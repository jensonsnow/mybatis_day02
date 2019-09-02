package com.hui.dao;

import com.hui.entity.Customer;

public interface CustomerDao {
	
	
	public int save(Customer customer);
	public int update(Customer customer);
	public Customer query(int id);
	public int delete(int id);

}
