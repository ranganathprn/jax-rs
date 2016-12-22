package com.rest.tut.restservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rest.tut.restservice.dao.CustomerDAO;
import com.rest.tut.restservice.model.CustomerModel;

public class CustomerService {

	private Map<Integer, CustomerModel> customers = CustomerDAO.getCustomers();

	public CustomerService() {
		customers.put(1, new CustomerModel("Mahesh", 1, 35));
		customers.put(2, new CustomerModel("Jhon", 2, 35));
	}

	public List<CustomerModel> getAllCustomers() {

		return new ArrayList<CustomerModel>(customers.values());

	}
	
	public CustomerModel getCustomer(int cuid){
		return customers.get(cuid);
	}
	
	public CustomerModel addCustomer(CustomerModel customer){
		System.out.println("Adding Customer:");
		int nextVal = customers.size()+1;
		customer.setCustId(nextVal);
		customers.put(nextVal, customer);
		return customers.get(nextVal);
	}
	
	public CustomerModel updateCustomer(int cuid,CustomerModel customer){
		customers.put(cuid, customer);
		return customers.get(cuid);
	}

}
