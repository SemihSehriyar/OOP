package com.mycompany.finalq5;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FinalQ5 {

    public static void main(String[] args) {
        Book b1 = new Book("harry potter", 15.0);
        Book b2 = new Book("lotr", 14.5);
        Book b3 = new Book("got", 14.5);
        Book b4 = new Book("orange", 13.5);
        
        List<Book> Books = new LinkedList();
        
        Books.add(b1);
        Books.add(b2);
        Books.add(b3);
        Books.add(b4);
        
        Collections.sort(Books);
        Iterator iter=Books.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
    }
}
