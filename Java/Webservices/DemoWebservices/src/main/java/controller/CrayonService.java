package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bo.Crayon;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/crayons")
@Produces(MediaType.APPLICATION_JSON)
public class CrayonService {
	private static List<Crayon> crayons; 
	
	static {
		crayons = new ArrayList<>();
		crayons.addAll(Arrays.asList(
			new Crayon(0, "bic", "4 couleurs"),
			new Crayon(1, "feutre", "rouge"),
			new Crayon(2, "fluo", "jaune"),
			new Crayon(3, "plume", "bleu"),
			new Crayon(4, "effaceur", "")
		));
	}
	
	
	//http://localhost:8080/DemoWebservices/api/crayons
	@GET 
	public List<Crayon> getAll() {
		return crayons;
	}
	
	//http://localhost:8080/DemoWebservices/api/crayons/2
	@GET @Path("/{id : \\d+}")
	public Crayon getById(@PathParam("id") int id) {
		return crayons.get(id);
	}
	
	@GET @Path("/{couleur : [a-zA-Z]+}")
	public Crayon getByCouleur(@PathParam("couleur") String couleur) {
		return crayons.stream().filter(c -> c.getCouleur().equals(couleur)).findFirst().get();
	}
	
	@POST
	public Crayon addCrayon(Crayon crayon) {
		crayon.setId(crayons.size());
		crayons.add(crayon);
		return crayon;
	}
	
	@PUT @Path("/{id : \\d+}")
	public Crayon updateCrayon(@PathParam("id") int id, Crayon crayon) {
		crayon.setId(id);
		crayons.set(id, crayon);
		return crayon;	
	}
	
	@DELETE @Path("/{id : \\d+}")
	public Crayon deleteCrayon(@PathParam("id") int id) {
		return crayons.remove(id);
	}
	
			
}
