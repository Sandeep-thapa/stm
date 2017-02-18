/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Sandeep
 */
import java.io.Serializable;
import java.util.Map;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Notes implements Serializable {

    private static final long SerialVersionUID = 1L;
    // private String notes; //notes for display in user profiles

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id; //automatially generated id,
    @Basic
    private int senderID;

    @Basic
    private int receiverID;

    @Basic
    private String Date;

    @Basic
    private String content;
    
    private Map<Integer, Notes> notes;

    public void Notes() {
    }

    ;
    public void Notes(int id, int senderID, int receiverID,String Date, String content) {
        this.id= id;
        this.Date=Date;
        this.content=content;
        this.receiverID=receiverID;
        this.senderID= senderID;
        
        

    }

    /**
     * @return the id
     */
    @XmlElement
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the senderID
     */
    @XmlElement
    public int getSenderID() {
        return senderID;
    }

    /**
     * @param senderID the senderID to set
     */
    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    /**
     * @return the receiverID
     */
    @XmlElement
    public int getReceiverID() {
        return receiverID;
    }

    /**
     * @param receiverID the receiverID to set
     */
    public void setReceiverID(int receiverID) {
        this.receiverID = receiverID;
    }

    /**
     * @return the Date
     */
    @XmlElement
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the content
     */
    @XmlElement
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the notes
     */
    @XmlElement
    public Map<Integer, Notes> getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(Map<Integer, Notes> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return " " + getReceiverID() + " " + getContent() + " " + getSenderID();
    }

}
