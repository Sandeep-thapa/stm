/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Map;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Sandeep
 */
@Entity
@XmlRootElement
@Table(name = "TestUsers")
public class Profile implements Serializable {

    private static final long serialVersionUID = 1l; // uid version of your current file
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id; //Auto generate id 

    @Basic
    private String userName;//User Name set for user

    @Basic
    private String password; //password for the user

    @Basic
    private String userGroup;//Goroup division criteria for rights user and admin

    @Basic
    private String email; //email-address of a user

    @Basic
    private long phoneNumber;//phone number of a user

    @Basic
    private String Sex;

    @Basic
    private int Age;

    private Map<Integer, Notes> allNotes;

    private Map<Integer, Alert> allAlerts;

    @Basic
    private String fullName; // Full name of the user

    @Basic
    private String Title; //Working title of the user

    private Map<Integer, Profile> userList;

    //no arguments constructor for further uses
    public void Profile() {

    }

    public void Profile(String userName, String password, String userGroup, String email, long phoneNumber, String Sex, int Age, String fullName, String Title) {
        this.email = email;
        this.id = id;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.userGroup = userGroup;
        this.userName = userName;
        this.Sex = Sex;
        this.Age = Age;
        this.fullName = fullName;
        this.Title = Title;

    }

    /**
     * @return the id automatically generated id
     */
    @XmlElement
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set automatically generated id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the userName
     */
    @XmlElement
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    @XmlElement
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the userGroup
     */
    @XmlElement
    public String getUserGroup() {
        return userGroup;
    }

    /**
     * @param userGroup the userGroup to set
     */
    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    /**
     * @return the email
     */
    @XmlElement
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    @XmlElement
    public long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the Sex
     */
    @XmlElement
    public String getSex() {
        return Sex;
    }

    /**
     * @param Sex the Sex to set
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * @return the Age
     */
    @XmlElement
    public int getAge() {
        return Age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    /**
     * @return the allNotes
     */
    @XmlTransient
    public Map<Integer, Notes> getAllNotes() {
        return allNotes;
    }

    /**
     * @param allNotes the allNotes to set
     */
    public void setAllNotes(Map<Integer, Notes> allNotes) {
        this.allNotes = allNotes;
    }

    /**
     * @return the allAlerts
     */
    @XmlTransient
    public Map<Integer, Alert> getAllAlerts() {
        return allAlerts;
    }

    /**
     * @param allAlerts the allAlerts to set
     */
    public void setAllAlerts(Map<Integer, Alert> allAlerts) {
        this.allAlerts = allAlerts;
    }

    /**
     * @return the fullName
     */
    @XmlElement
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the Title
     */
    @XmlElement
    public String getTitle() {
        return Title;
    }

    /**
     * @param Title the Title to set
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * @return the userLIst
     */
    @XmlTransient
    public Map<Integer, Profile> getUserList() {
        return userList;
    }

    /**
     * @param userLIst the userLIst to set
     */
    public void setUserList(Map<Integer, Profile> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return " " + getSex() + " " + getFullName() + " " + getPhoneNumber();
    }

}
