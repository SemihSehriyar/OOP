/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.time;

public class Minute {
    
    private int minute;
    
    public Minute(int minute){
        if (minute > 0 || minute < 59) {
           this.minute = minute;
       } 
    }
}
