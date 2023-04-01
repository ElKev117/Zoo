package com.mycompany.zooproject.Controlador;
import java.util.*;

/**
 * 
 */
public class Animal {
    /**
     * Parameters
     */
    private String name;
    private String code;
    private int age;
    private String gender;
    private String state;
    private String origin;
    private boolean mammal;
    private String habitat;

    
    /**
     * Constructorssssvfffffff
     */
    public Animal() {
    }

    public Animal(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public Animal(String name, String code, int age, String gender) {
        this.name = name;
        this.code = code;
        this.age = age;
        this.gender = gender;
    }

    public Animal(String name, String code, int age, String gender, String state, String origin, boolean mammal, String habitat) {
        this.name = name;
        this.code = code;
        this.age = age;
        this.gender = gender;
        this.state = state;
        this.origin = origin;
        this.mammal = mammal;
        this.habitat = habitat;
    }
    
  

    /**
     * Getters and setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0)
            this.age = age;
        this.age = 0;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public boolean isMammal() {
        return mammal;
    }

    public void setMammal(boolean mammal) {
        this.mammal = mammal;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    public boolean getMammal(){
        return mammal;
    }
    
    public void getMammal(boolean mammal){
        this.mammal = mammal;
    }
    
    

    /**
     * @return
     */
    public void feed() {
        // TODO implement here hola kevin
       
    }

    

}