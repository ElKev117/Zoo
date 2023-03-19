package com.mycompany.zooproject;
import java.util.*;

/**
 * 
 */
public class Sale {
    /**
     * Parameters
     */
    private float price;
    private int quantity;

    /**
     * Default constructor
     */
    public Sale() {
    }

    public Sale(float price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }
    
    
    /**
     * Getters and setters
     */
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    /**
     * @return
     */
    public void sale() {
        // TODO implement here right now
      
    }

}