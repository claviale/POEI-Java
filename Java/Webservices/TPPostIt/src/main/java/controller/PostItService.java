package controller;

import java.util.List;

import bll.PostItBLL;
import bo.PostIt;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/post-its")
@Produces(MediaType.APPLICATION_JSON)
public class PostItService {
	private static PostItBLL bll;
	private static List<PostIt> postIts;
	
	public PostItService() {
		bll = new PostItBLL();
	}
	
	@GET 
	public List<PostIt> getAll() {
		postIts = bll.select();
		return postIts;
	}
	
	@GET @Path("/{id : \\d+}")
	public PostIt getById(@PathParam("id") int id) {
		PostIt postIt = bll.selectById(id);
		return postIt;
		
	}
	
	@POST
	public PostIt addPostIt(PostIt postIt) {
		bll.insert(postIt);
		return postIt;
	}
	
	@PUT @Path("/{id : \\d+}")
	public PostIt updatePostIt(@PathParam("id") int id, PostIt postIt) {
		postIt.setId(id);
		bll.update(postIt);
		return postIt;	
	}
	
	@DELETE @Path("/{id : \\d+}")
	public PostIt deletePostIt(@PathParam("id") int id) {
		PostIt postItASuppr = bll.selectById(id);
		bll.delete(postItASuppr);
		return postItASuppr;
	}

}
