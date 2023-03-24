package com.mycompany.zooproject.Controlador;
import com.mycompany.zooproject.Costumer;
import com.mycompany.zooproject.Management;
import java.util.*;

/**
 * 
 */
public class CostumerManagement extends Management {
    /**
     * Parameters
     */
    private ArrayList<Costumer> costumer;
    
    /**
     * Constructor
     */
    public CostumerManagement() {
    }

    public CostumerManagement(ArrayList<Costumer> costumer) {
        this.costumer = costumer;
    }

     /**
     * Getters and setters
     */
    public ArrayList<Costumer> getCostumer() {
        return costumer;
    }

    public void setCostumer(ArrayList<Costumer> costumer) {
        this.costumer = costumer;
    }


    /**
     * Methods
     */
    public void addCostumer(Costumer c) {
        costumer.add(c);
    }
    
    public Costumer findCostumer(String id) {
        
        for(Costumer c : costumer){
            if(c.getId().equals(id)){
                return c;
            }
        }
        
        System.out.println("No existe el consumidor");
        return null;
    }
    
    /**
     * 
     */
    public void editCostumer(String id, String newId) {
        Costumer c = findCostumer(id);
        c.setId(newId);
    }

    /**
     * 
     */
    public void deleteCostumer(String id) {
        costumer.remove(findCostumer(id));
    }


}