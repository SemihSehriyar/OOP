/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.time;

public class Hour {
    
    private int hour;
    
    public Hour(int hour){
        if (hour > 0 || hour < 24) {
           this.hour = hour;
       } 
    }
}
