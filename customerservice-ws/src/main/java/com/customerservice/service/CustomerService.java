package com.customerservice.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;
import org.springframework.web.bind.annotation.RequestBody;

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
	
	@POST
	@Path("/getCustomerPostPathParam/{id}")
	@Description(value = "Resource", target = DocTarget.RESOURCE)
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
	public String getCustomerPostPathParam(@Description("id") @PathParam("id") final Integer id);
	
	
	@POST
	@Path("/getCustomerPostQueryParam")
	@Description(value = "Resource", target = DocTarget.RESOURCE)
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
	public String getCustomerPostQueryParam(@Description("id") @QueryParam("id") final Integer id);
	
	@POST
	@Path("/getCustomerPostRequestBody")
	@Description(value = "Resource", target = DocTarget.RESOURCE)
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
	public Customer getCustomerPostRequestBody(@Description("id") @RequestBody final String customerJson);
	
	/*
	 * Annotation which indicates that a method parameter should be bound to a web request parameter. Supported for annotated handler methods in Servlet and Portlet environments. 
	 */
	
}
