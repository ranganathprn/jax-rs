package com.rest.tut.restservice.dao;

import java.util.HashMap;
import java.util.Map;

import com.rest.tut.restservice.model.CustomerModel;

public class CustomerDAO {

	private static Map<Integer,CustomerModel> customers = new HashMap<Integer,CustomerModel>();

	public static Map<Integer,CustomerModel> getCustomers() {
		return customers;
	}

}
