/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import models.Alert;
import models.Notes;
import models.Profile;

/**
 *
 * @author Sandeep
 */
public class NotesServices implements Serializable {

    private static final long serialVersionUID = 1L;
    ProfileServices userList;
  
	
private static Map<Integer,Notes> message = AllServices.getMessages();
private static Map<Integer,Profile> user = AllServices.getUsers();
private static Map<Integer,Alert> alert = AllServices.getAlert();


	
	public NotesServices() throws Exception{
          userList  = new ProfileServices();
		message.put(1, new Notes(userList.getUser(1).getId(),userList.getUser(2).getId(),new Date().toString(),"hello there",1));
		message.put(2, new Notes(userList.getUser(2).getId(),userList.getUser(1).getId(),new Date().toString(),"hello tfdhhere",2));

	}
	
	// all the method  down are for all the message not based on user   
    public static  List<Notes> getMessages (){
         return new ArrayList<Notes>(message.values()); 

    }
	public Notes getMessage(int id) {
		return message.get(id);
	}

    
    public Notes AddMessage(Notes msg){
    msg.setDate(new Date().toString());
    msg.setId(message.size()+1);
      message.put(msg.getId(), msg);
      System.out.println(msg);
       return msg;
    	
    }
    public Notes updateMessage (Notes msg){
    	if (msg.getId()<1){
    		return null;
    	}
    	msg.setDate(new Date().toString());
    	message.put(msg.getId(), msg);
    	return msg;
    }
    
    public Notes removeMessage(Integer id){
    	return message.remove(id);
    }
 // all the messages are on based of user
    
    public  List<Notes> getAllMessageByUser(int userId){
    	ArrayList<Notes> myMsg = new ArrayList<Notes>(message.values());
    	ArrayList<Notes>finalMessageList = new ArrayList<Notes>();
    	for(int i =0; i< myMsg.size(); i++){
    		Notes msgAdder = myMsg.get(i);
    		if (msgAdder.getReceiverID() ==(userId)|| msgAdder.getSenderID() ==(userId)){
    			finalMessageList.add(msgAdder);
    			
    		}
    	}
    	return finalMessageList;
    	
    }
  
}
