/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import javax.ws.rs.Path;

/**
 *
 * @author Sandeep
 */
@Path("/messages")
public class MessageResource {
    
    public String getMessage(){
    return "Hello world ";
    }
}
