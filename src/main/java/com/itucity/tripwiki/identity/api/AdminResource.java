package com.itucity.tripwiki.identity.api;

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

import com.itucity.tripwiki.identity.model.Admin;
import com.itucity.tripwiki.identity.service.AdminService;


@Path("/admin")
@Service
public class AdminResource {

	@Autowired
    private AdminService adminService;  
	
	@GET
	@Produces({"application/json", "application/xml"})
	public List<Admin> getAllAdmin(){
		return adminService.getAllAdmin();
	}
	
	@GET
	@Path("{adminId}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Admin getAdmin(@PathParam("adminId") String adminId){
		return adminService.getAdmin(adminId);
	}
	
	@PUT
	@Path("{adminId}")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public void  updateAdmin(Admin admin, @PathParam("adminId") String adminId){
		Admin a = adminService.getAdmin(adminId);
		if(admin == null || a == null){
			throw new WebApplicationException(404);
		}
		adminService.updateAdmin(admin);
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Response updateAdmin(Admin admin, @Context UriInfo uri){
		URI createdUri = URI.create(uri.getRequestUri().toString()+"/"+admin.getId());
		adminService.insertAdmin(admin);
		return Response.created(createdUri).build();
	}
	
	@DELETE @Path("{adminId}")
	public void deleteAdmin(@PathParam("adminId") String adminId){
		Admin a = adminService.getAdmin(adminId);
		if(a == null ){
			throw new WebApplicationException(404);
		}
		adminService.deleteAdmin(adminId);
	}
}
