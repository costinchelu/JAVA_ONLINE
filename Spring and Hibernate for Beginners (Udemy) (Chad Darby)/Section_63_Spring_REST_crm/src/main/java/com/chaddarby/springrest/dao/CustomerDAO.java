package com.chaddarby.springrest.dao;

import java.util.List;

import com.chaddarby.springrest.entity.Customer;


public interface CustomerDAO {

	List<Customer> getCustomers();

	void saveCustomer(Customer customer);

	Customer getCustomer(int customerId);

	void deleteCustomer(int customerId);
	
}
