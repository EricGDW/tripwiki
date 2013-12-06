package com.itucity.tripwiki.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/demo")
public class RestDemo {

	@Autowired
    RestDemoService demoService;

    @GET
    @Path("/hello")
    public String sayHello() {
        return demoService.say();

    }
}
