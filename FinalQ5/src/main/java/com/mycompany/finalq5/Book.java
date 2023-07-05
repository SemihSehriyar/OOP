package com.mycompany.finalq5;
import java.util.Comparator;

public class Book implements Comparable<Book> {
    String name;
    double price;
    
    Book(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    double totalPrice(){        
        return price + 0.08 * price;
    }
    public int compareTo(Book b) {
        return (int)(this.totalPrice()- b.totalPrice());
    }
    public String toString() {
        return "Name: "+name+", Price: "+price;
    }
}

