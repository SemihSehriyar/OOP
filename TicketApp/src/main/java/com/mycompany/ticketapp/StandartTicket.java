package com.mycompany.ticketapp;

public class StandartTicket extends Ticket{
    double price;
    
    public StandartTicket(int seatNumber, int number){
        super(seatNumber, number);
        this.price = 10;
    }
    
    public void print(){
        System.out.println(seatNumber+" "+number+" "+price);
    }
    
    public double computePrice(){
        
        return price;
    }
}