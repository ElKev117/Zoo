/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.zooproject.Controlador;

/**
 *
 * @author brayan
 */
public interface Plans {
    public static final float PLAN_0 = 0.0f;    //Descuento del 5%
    public static final float PLAN_1 = 0.05f;   //Descuento del 5%
    public static final float PLAN_2 = 0.08f;   //Descuento del 6%
    public static final float PLAN_3 = 0.10f;   //Descuento del 7%
    public static final float PLAN_4 = 0.15f;   //Descuento del 15%
    public static final float PLAN_5 = 0.2f;    //Descuento del 20%
    
    //Value of each plan
    public static final float AMOUNT_PLAN_0 = 0;
    public static final float AMOUNT_PLAN_1 = 2;
    public static final float AMOUNT_PLAN_2 = 4;
    public static final float AMOUNT_PLAN_3 = 5;
    public static final float AMOUNT_PLAN_4 = 20;
    public static final float AMOUNT_PLAN_5 = 30;
    
    //Ticket value
    public static final float SIMPLE_TICKET_VALUE = 5;
    public static final float PLUS_TICKET_VALUE   = 7;
    public static final float PLUS_GUIDED_TICKET_VALUE = 10;
}
