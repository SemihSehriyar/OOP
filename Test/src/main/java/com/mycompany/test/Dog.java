/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author semse
 */
public class Dog extends Features{
    
    public Dog(String name){
        this.name = name;
        numberOfFeet = 4;
    }

    @Override
    public void Food(){
       System.out.println("meat");
    }

    @Override
    public void Voice(){
        System.out.println("hav hav");
    }
}
