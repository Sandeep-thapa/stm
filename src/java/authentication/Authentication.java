/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authentication;

import java.util.List;
import models.Profile;
import services.ProfileServices;

/**
 *
 * @author Sandeep
 */
public class Authentication {
    
ProfileServices myService ;
    public Authentication() throws Exception {
        myService = new ProfileServices();

    }
    
     List<Profile> newList = ProfileServices.getUser();
     
  
    public  boolean checkAuthentication(String userName, String passWord) throws Exception {
          
        
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(userName);
            System.out.println(passWord);
            System.out.println(newList.get(i).getPassword());
          if ((newList.get(i).getUserName().equals(userName)) &&( newList.get(i).getPassword().equals(passWord)) ){ 
          
           return true;

            }
        }
      
                return false;

    }
        

    public  Profile getUser(String userName, String passWord) throws Exception {
            
    
        for (int i = 0; i < newList.size(); i++) {
         if (newList.get(i).getUserName().equals(userName) && newList.get(i).getPassword().equals(passWord)) { 
          //    if ((newList.get(i).getUserName().equals(userName)) &&( newList.get(i).getPassWord().equals(passWord)) ){
       return newList.get(i);

            }

    }
        return null;
}
}


