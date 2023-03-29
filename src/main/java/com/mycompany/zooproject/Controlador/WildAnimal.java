package com.mycompany.zooproject.Controlador;
import com.mycompany.zooproject.Controlador.Animal;
import java.util.*;

/**
 * 
 */
public class WildAnimal extends Animal {
    /**
     * 
     */
    private int dangerLevel;

    /**
     * Default constructor
     */
    public WildAnimal() {
    }
    
    
    public WildAnimal(String name, String code, int dangerLevel){
        super(name, code);
        this.dangerLevel = dangerLevel;
    }
    
    public WildAnimal(String name, String code, int age, char gender, int dangerLevel){
        super(name, code, age, gender);
        this.dangerLevel = dangerLevel;
    }
    
    public WildAnimal(String name, String code, int age, char gender, String state, String origin, boolean mammal, int dangerLevel){
        super(name, code, age, gender, state, origin, mammal);
        this.dangerLevel = dangerLevel;
    }
    
    
    /**
     * Getters and setters
     */
    public int getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(int dangerLevel) {
        if(dangerLevel>=0)
            this.dangerLevel = dangerLevel;
        this.dangerLevel = 0;
    }
    
    

}