package com.customerservice.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import com.customerservice.bean.Customer;

public interface CustomerService {

	@GET
	@Path("/getCustomer/{id}")
	@Description(value = "Resource", target = DocTarget.RESOURCE)
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
	public Customer getCustomer(@Description("id") @PathParam("id") final Integer id);

	@GET
	@Path("/createCustomer/{id}/{name}/{location}")
	@Description(value = "Resource", target = DocTarget.RESOURCE)
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
	public Customer createCustomer(@Description("id") @PathParam("id") final Integer id,
									@Description("name") @PathParam("name") final String name,
									@Description("address") @PathParam("location") final String location);

}
