package com.manisha.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResource {
	
	@GET
	@Produces("text/plain")
	public String hello() {
		return "Welcome to JAX-RS";
	}

}
