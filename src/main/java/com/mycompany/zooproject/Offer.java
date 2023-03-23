package com.mycompany.zooproject;
import java.util.*;

/**
 * 
 */
public class Offer implements Plans {
    /**
     * 
     */
    private float plan;
 
    
    /**
     * Default constructor
     */
    public Offer() {
       
    }

    /**
     * Getters and setters
     */
    public float getPlan() {
        return plan;
    }

    public void setPlan(float plan) {
        this.plan = plan;
    }
    
    public float getOffer(int plan) {
       if(plan==1){
           this.plan = Plans.PLAN_1;
       } else if(plan==2) {
           this.plan = Plans.PLAN_2;
       } else if(plan==3){
           this.plan = Plans.PLAN_3;
       } else if(plan==4){
           this.plan = Plans.PLAN_4;
       } else if(plan==5){
           this.plan = Plans.PLAN_5;
       } else if(plan==0){
           this.plan = Plans.PLAN_0;}
       
       return this.plan;
    }
    
    

    
    

    
}



