package org.acme.getting.started;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import io.vertx.core.http.HttpServerRequest;

@Path("/hello")
public class GreetingResource {

    @Context
    HttpServerRequest request;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello World v1.0 ==> " + request.localAddress();
    }
}