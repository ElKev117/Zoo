package com.mycompany.zooproject;
import java.util.*;

/**
 * 
 */
public class Costumer {
    
    /**
     * Parammeters
     */
    private String name;
    private String id;
    private int age;
    private String ticketCode;
    private int purchaseNumber;
    private float purchaseAmount;

    
    /**
     * Constructors
     */
    public Costumer() {
    }

    public Costumer(String name, String id, int age, String ticketCode, int purchaseNumber, float purchaseAmount) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.ticketCode = ticketCode;
        this.purchaseNumber = purchaseNumber;
        this.purchaseAmount = purchaseAmount;
    }

    public Costumer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Costumer(String ticketCode) {
        this.ticketCode = ticketCode;
    }
    
    
    /**
     * Getters and setters
     */
    public String getName() {
        return name;
        // TODO implement here
          }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public int getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(int purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
    }

    public float getPurchaseAmount() {
        return purchaseAmount;
    }
    

    /**
     * Getters and setters
     */
    public void setPurchaseAmount(float purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    /**
     * @return
     */
    public void buy() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void makeOffer() {
        // TODO implement here
    
    }

}