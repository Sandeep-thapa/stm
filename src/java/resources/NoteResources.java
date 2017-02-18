/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import models.Notes;
import services.NotesServices;

/**
 *
 * @author Sandeep
 */
@Path("/notes")
public class NoteResources {

    NotesServices service;

    public NoteResources() throws Exception {

        service = new NotesServices();
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Notes> getAllMessage() {

        return service.getMessages();

    }

    @Path("/{MsgId}")

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Notes getMessage(@PathParam("MsgId") int ID) {

        Notes newMessage = service.getMessage(ID);
        if (newMessage == null) {
            return null;

        }
        return newMessage;

    }

    @POST
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)

    public Notes addUser(Notes msg) {

        return service.AddMessage(msg);

    }

    @PUT
    @Path("/{MsgId}")

    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)

    public Notes updtaeUser(Notes msg) {
        Notes newMessage = service.getMessage(msg.getId());
        if (newMessage == null) {
            return null;

        }
        return service.updateMessage(msg);

    }

    @DELETE
    @Path("/{MessageId}")
    @Produces(MediaType.APPLICATION_XML)

    public Notes delUser(@PathParam("MessageId") int ID) {
        return service.removeMessage(ID);

    }

}
