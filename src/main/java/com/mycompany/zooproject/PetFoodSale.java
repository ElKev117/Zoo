package com.mycompany.zooproject;
import java.util.*;

/**
 * 
 */
public class PetFoodSale extends Sale {
    /**
     * 
     */
    private float price;
    private String product;
    private int quantity;
    
    /**
     * Default constructor
     */
    public PetFoodSale() {
    }

    /**
     * Getters and setters
     */
    public float getPrice() {
        return price;
        // TODO implement here
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
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
        // TODO implement here
    }

}