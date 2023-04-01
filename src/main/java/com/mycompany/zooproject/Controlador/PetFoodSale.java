package com.mycompany.zooproject.Controlador;
import java.util.*;

/**
 * 
 */
public class PetFoodSale extends Sale {
    /**
     * 
     */
    private String product;

    /**
     * Default constructor
     */
    public PetFoodSale(String product, float price, int quantity) {    
        super(price, quantity);
        this.product = product;
        // TODO implement here
    }
    
    public PetFoodSale() {    
        // TODO implement here
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
    

    /**
     * @return
     */
    public void sale() {
        // TODO implement here
    }

}