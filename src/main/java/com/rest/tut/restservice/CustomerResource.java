package com.rest.tut.restservice;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.tut.restservice.model.CustomerModel;
import com.rest.tut.restservice.service.CustomerService;

@Path("/customers")
public class CustomerResource {
	
	CustomerService service = new CustomerService();

	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public List<CustomerModel> getCustomers() {
		return service.getAllCustomers();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{cuid}")
	public CustomerModel getCustomer(@PathParam("cuid") int cuid){
		return service.getCustomer( cuid);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public CustomerModel addCustomer(CustomerModel customer){
		return service.addCustomer(customer);
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{cuid}")
	public CustomerModel updateCustomer(@PathParam("cuid") int cuid, CustomerModel customer){
		customer.setCustId(cuid);
		return service.updateCustomer(cuid, customer);
	}


}
