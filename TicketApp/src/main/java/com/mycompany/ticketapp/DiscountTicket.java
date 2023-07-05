package com.mycompany.ticketapp;

public class DiscountTicket extends StandartTicket{
    double discount;
    
    public DiscountTicket(int number, int seatNumber, double discount){
        super(seatNumber, number);
        this.discount = discount;
    }
    public void print(){
        System.out.println(seatNumber +" "+price +" "+ number +" "+ discount);
    }
    public double computePrice(){
        return super.computePrice() - price*discount;
    }
    
}