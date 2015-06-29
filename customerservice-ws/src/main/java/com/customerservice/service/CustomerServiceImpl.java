package com.customerservice.service;

import org.springframework.stereotype.Component;

import com.customerservice.bean.Customer;

@Component("customerService")
public class CustomerServiceImpl implements CustomerService {

	public Customer getCustomerDetails(Integer id) {
		Customer customer = new Customer();
		customer.setId(id);
		customer.setName("sriram of " + id);
		customer.setLocation("Ayodya of " + id);
		return customer;
	}

	public Customer getCustomer(Integer id) {
		return getCustomerDetails(id);
	}

	public Customer createCustomer(Integer id, String name, String location) {
		Customer customer = new Customer();
		customer.setId(id);
		customer.setName(name);
		customer.setLocation(location);
		return customer;
	}
}
