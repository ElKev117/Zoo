package com.mycompany.zooproject;
import java.util.*;

/**
 * 
 */
public class FoodSale extends Sale {

    /**
     * 
     */
    private String product;
    
    /**
     * Constructors
     */
    public FoodSale() {
    }

    public FoodSale(String product) {
        this.product = product;
    }

    public FoodSale(String product, float price, int quantity) {
        super(price, quantity);
        this.product = product;
    }
    
    /**
     * Getters and setters
     */
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
    
    
    
    
    
    

    

   

}