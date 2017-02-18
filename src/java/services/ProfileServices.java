/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import models.Profile;

/**
 *
 * @author Sandeep
 */
public class ProfileServices implements Serializable {

    private static final long serialVersionUID = 1L;
    private static Map<Integer, Profile> users = AllServices.getUsers();

    public ProfileServices()
            throws Exception {

        users.put(1, new Profile("a", "password", "userGroup", "email", 4564646l, "Sex", 22, "fullName", " Title"));
        users.put(2, new Profile("b", "password", "userGroup", "email", 4564646l, "Sex", 22, "fullName", " Title"));
        users.put(3, new Profile("c", "password", "userGroup", "email", 456464l, "Sex", 22, "fullName", " Title"));
    }

    public static List<Profile> getUser() {
        return new ArrayList<Profile>(users.values());
    }

    public Profile getUser(int id) {
        return users.get(id);
    }

    public Profile AddUser(Profile user) {
        user.setId(users.size() + 1);
        users.put(user.getId(), user);
        return user;
    }

    public Profile updateUser(Profile user) {
        if (user.getId() < 1) {
            return null;
        }
        users.put(user.getId(), user);
        return user;
    }
    
    public Profile removeUser(int id){
    return users.remove(id);
    }
}
