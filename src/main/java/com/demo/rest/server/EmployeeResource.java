package com.demo.rest.server;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/api")
public class EmployeeResource {

	@GET
	@Path("/getEmplyees")
	@Produces("application/json")
	public List<Employee> getProductInJSON() {

		EmployeeMapper empMaper = new EmployeeMapper();
		System.out.println("Done!!!!!");
		return empMaper.getAllEmployees();

	}

}