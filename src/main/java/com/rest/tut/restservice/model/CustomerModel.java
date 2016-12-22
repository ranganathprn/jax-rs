package com.rest.tut.restservice.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerModel {
	
	private String customerName;
	private int custId;
	private int age;
	public CustomerModel(){
		
	}
	
	public CustomerModel(String customerName, int custid, int age){
		this.customerName =  customerName;
		this.custId = custid;
		this.age = age;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
