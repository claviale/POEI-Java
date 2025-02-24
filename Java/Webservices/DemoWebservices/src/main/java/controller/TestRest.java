package controller;

import bo.Crayon;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/test")
public class TestRest {
	
	@GET
	public String commeOnVeut() {
		return "Hello world!";
	}
	
	@GET @Path("/crayon") @Produces(MediaType.APPLICATION_JSON)
	public Crayon getCrayon() {
		return new Crayon(1, "bic", "4 couleurs");
	}
}
