package com.mycompany.zooproject;
import java.util.*;

/**
 * 
 */
public class Ticket extends Sale {
    /**
     * 
     */
    private String type;
    private String code;

    /**
     * Default constructor
     */
    public Ticket() {
    }

    public Ticket(String type, String code) {
        this.type = type;
        this.code = code;
    }

    public Ticket(String type, String code, float price, int quantity) {
        super(price, quantity);
        this.type = type;
        this.code = code;
    }
    

    /**
     * Getter and setters
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    
    

}