/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.List;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import models.Notes;
import models.Profile;
import services.ProfileServices;

/**
 *
 * @author Sandeep
 */
@Produces(MediaType.APPLICATION_XML)
@Path("/profiles")
public class ProfileResources {

    ProfileServices service;

    public ProfileResources() throws Exception {
        service = new ProfileServices();
    }

    @GET
    @Produces({"application/xml"})
    @PermitAll
    public List<Profile> getAllUser() {
        return ProfileServices.getUser();
    }

    @Path("/{userId}")
    @GET
    @Produces({"application/xml"})
    @PermitAll
    public Profile getUser(@PathParam("userId") int ID)
            throws Exception {
        Profile myUserList = this.service.getUser(ID);
        if (myUserList == null) {
           return null;
        }
        return myUserList;
    }

    @POST
    @Produces({"application/xml"})
    @Consumes({"application/xml"})
    @RolesAllowed({"admin"})
    public Profile addUser(Profile user)
            throws Exception {
        return this.service.AddUser(user);
    }

    @PUT
    @Path("/{userId}")
    @Produces({"application/xml"})
    @Consumes({"application/xml"})
    @RolesAllowed({"admin", "user"})
    public Profile updtaeUser(Profile user)
            throws Exception {
        return this.service.updateUser(user);
    }

    @DELETE
    @Path("/{userId}")
    @Produces({"application/xml"})
    @RolesAllowed({"admin"})
    public Profile delUser(@PathParam("userId") int ID)
            throws Exception {
        return this.service.removeUser(Integer.valueOf(ID));
    }

  
}
