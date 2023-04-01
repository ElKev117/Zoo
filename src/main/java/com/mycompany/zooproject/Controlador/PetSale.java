package com.mycompany.zooproject.Controlador;
import com.mycompany.zooproject.Controlador.PetAnimal;
import java.util.*;

/**
 * 
 */
public class PetSale extends PetAnimal {
    /**
     * Parameters
     */
    private float price;
    private String saleDate;

    /**
     * Default constructor
     */
    public PetSale() {
        
    }

    public PetSale(float price, String saleDate, String name, String code) {
        super(name, code);
        this.price = price;
        this.saleDate = saleDate;
    }

    public PetSale(float price, String saleDate) {
        this.price = price;
        this.saleDate = saleDate;
    }
    
    
    /**
     * getters and setters
     */
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(price>=0)
            this.price = price;
        this.price = 0;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }


    /**
     * @return
     */
    public void sale() {
        // TODO implement here
       
    }

}