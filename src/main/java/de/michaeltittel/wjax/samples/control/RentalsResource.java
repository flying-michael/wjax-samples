/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package de.michaeltittel.wjax.samples.control;

import de.michaeltittel.wjax.samples.business.Vehicle;
import java.net.URI;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author mtittel
 */
@Path("/rentals")
@Stateless
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Consumes(MediaType.APPLICATION_XML)
public class RentalsResource {

    @GET
    public Vehicle allRentals() {
        return new Vehicle("ampera");
    }

    @GET
    @Path("{ps}-{id}")
    public Vehicle rental(@PathParam("ps") int ps, @PathParam("id") String id) {
        return new Vehicle(ps + id);
    }

    @POST
    public Response rent(Vehicle vehicle) {
        System.out.println("----Should work: " + vehicle);
        URI uri = URI.create("42");
        return Response.created(uri).build();
    }
}
