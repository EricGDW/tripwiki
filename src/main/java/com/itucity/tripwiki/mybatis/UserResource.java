package com.itucity.tripwiki.mybatis;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Path("/user")
@Service
public class UserResource {
	
	@Autowired
    private UserService userService;  
	
	@GET
	@Produces({"application/json", "application/xml"})
	public List<UserEntity> getAllUser(){
		return userService.getAllUser();
	}
	
	@GET
	@Path("{userID}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public UserEntity getUser(@PathParam("userID") String userID){
		return userService.getUser(userID);
	}
	
	@PUT
	@Path("{userID}")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public void  updateUser(UserEntity user, @PathParam("userID") String userID){
		UserEntity u = userService.getUser(userID);
		if(user == null || u == null){
			throw new WebApplicationException(404);
		}
		userService.updateUser(user);
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Response updateUser(UserEntity user, @Context UriInfo uri){
		URI createdUri = URI.create(uri.getRequestUri().toString()+"/"+user.getUserID());
		userService.insertUser(user);
		return Response.created(createdUri).build();
	}
	
	@DELETE @Path("{userId}")
	public void deleyeUser(@PathParam("userId") String userId){
		UserEntity user = userService.getUser(userId);
		if(user == null ){
			throw new WebApplicationException(404);
		}
		userService.deleteUser(userId);
	}
}
