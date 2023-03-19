package com.mycompany.zooproject;
import java.util.*;

/**
 * 
 */
public class PetAnimal extends Animal {

    /**
     * Constructors
     */
    public PetAnimal() {
        
    }
    
    public PetAnimal(String name, String code){
        super(name, code);
    }
    
    public PetAnimal(String name, String code, int age, char gender){
        super(name, code, age, gender);
    }
    
    public PetAnimal(String name, String code, int age, char gender, String state, String origin, boolean mammal){
        super(name, code, age, gender, state, origin, mammal);
    }
    
    

    /**
     * 
     */
    public void play() {
        // TODO implement here
    }

}