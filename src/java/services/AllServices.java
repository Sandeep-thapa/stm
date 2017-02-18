/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import models.Alert;
import models.Notes;
import models.Profile;

/**
 *
 * @author Sandeep
 */
public class AllServices implements Serializable {
    private static final long serialVersionUID = 1L;
  private static Map<Integer, Profile> user = new HashMap();
  private static Map<Integer, Alert> Alert = new HashMap();
  private static Map<Integer, Notes> message = new HashMap();
  //private static Map<Integer, ChatBox> chat = new HashMap();
  
  public static Map<Integer, Notes> getMessages()
  {
    return message;
  }
  
  public static Map<Integer, Alert> getAlert()
  {
    return Alert;
  }
  
  public static Map<Integer, Profile> getUsers()
  {
    return user;
  }
  
  
}
