package com.mycompany.Hw2;

import java.awt.BorderLayout;

public class Hw2 {

    public static void main(String[] args) {
        try{
            EncapsulatedStudent s1 = new EncapsulatedStudent(100,100);
            System.out.println(s1.GetAvarage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("DONE");
        }
    }
}