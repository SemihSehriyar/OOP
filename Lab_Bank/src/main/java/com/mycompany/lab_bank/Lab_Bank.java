package com.mycompany.lab_bank;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lab_Bank {

    public static void main(String[] args) {
        
        BankAccount a1 = new BankAccount(7, "Semih", 1);
        BankAccount a2 = new BankAccount(4, "Ali", 9);
        BankAccount a3 = new BankAccount(3, "Mehmet", 6);
        ArrayList<BankAccount> List = new ArrayList<BankAccount>();
        List.add(a1);
        List.add(a2);
        List.add(a3);
        
        Iterator<BankAccount> iter = List.iterator();
        Collections.sort(List,new NameComp());
        for (BankAccount a:List) 
            System.out.println(a);
    }
}
