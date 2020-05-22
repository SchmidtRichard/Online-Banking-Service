/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.models;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author Bobo
 */
@Path("/withdraw")
public class Withdraw {
       @GET
    @Path("/{param}")
    public Response sayHelloWorld(@PathParam("param") int cash) {
        String output = "You took out: " + cash + " euro" + "You had 5000 euro. Now you have" + String.valueOf(5000 - cash) + " euro";
        return Response.status(200).entity(output).build();
    } 
}
