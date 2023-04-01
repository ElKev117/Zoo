package com.mycompany.zooproject.Modelo;
import com.mycompany.zooproject.Controlador.Animal;
import java.util.*;

/**
 * 
 */
public class AnimalManagement extends Management {
    
    /**
     * 
     */
    private ArrayList<Animal> animal = new ArrayList<>();

    /**
     * Default constructor
     */
    public AnimalManagement() {
        super();
    }

    public AnimalManagement(ArrayList<Animal> animal) {
        this.animal = animal;
    }
    

    /**
     * Getters and setters
     */
    public ArrayList<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(ArrayList<Animal> animal) {
        this.animal = animal;
    }


    /**
     * Methods
     */
    public void addAnimal(Animal a) {
        animal.add(a);
    }
     
    /**
     * 
     */
    public Animal findAnimal(String code) {
        
        for(Animal a : animal){
            if(a.getCode().equals(code)){
                return a;
            }
        }
        
        System.out.println("No existe el animal");
        return null;
    }
    
    
    /**
     * 
     */
    public void editAnimalCode(String code, String newCode){
        Animal a = findAnimal(code);
        a.setCode(newCode);
    }
    
    /**
     * 
     */
    public void editAnimalState(String code, String newState){
        Animal a = findAnimal(code);
        a.setState(newState);
    }
    
    
    /**
     * 
     */
    public void deleteAnimal(String code) {
        animal.remove(findAnimal(code));
    }
    
    /**
     * 
     */
    public void soldAnimal() {
        // TODO implement here
    }
    

}