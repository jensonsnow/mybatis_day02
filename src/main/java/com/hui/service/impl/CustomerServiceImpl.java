package com.hui.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hui.dao.CustomerDao;
import com.hui.entity.Customer;
import com.hui.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

	public int save(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.save(customer);
	}

	public int update(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.update(customer);
	}

	public Customer query(int id) {
		// TODO Auto-generated method stub
		return customerDao.query(id);
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return customerDao.delete(id);
	}

}
