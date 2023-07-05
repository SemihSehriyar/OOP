/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author semse
 */
public class Duck extends Features{
    
    public Duck(String name){
	this.name = name;
	numberOfFeet = 2;
    }

    @Override
    public void Food(){
        System.out.println("bread");
    }

    @Override
    public void Voice(){
        System.out.println("vak vak");
    }
}
