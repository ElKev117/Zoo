package com.mycompany.zooproject;
import java.util.*;

/**
 * 
 */
public class PetSale extends PetAnimal {
    /**
     * Parameters
     */
    private float price;
    private Date saleDate;

    /**
     * Default constructor
     */
    public PetSale() {
        
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(price>=0)
            this.price = price;
        this.price = 0;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }


    /**
     * @return
     */
    public void sale() {
        // TODO implement here
       
    }

}