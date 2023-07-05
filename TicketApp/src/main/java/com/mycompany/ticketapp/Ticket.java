package com.mycompany.ticketapp;

import java.util.Comparator;

public abstract class Ticket {
    public int number;
    int seatNumber;
    
    Ticket(int seatNumber, int number){
        this.number = number;
        this.seatNumber = seatNumber;
    }
    
    public abstract void print();
    public abstract double computePrice();
}