/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test;

/**
 *
 * @author semse
 */
public class Test {

    public static void main(String[] args) {
        
        Duck duck = new Duck("karacaoglan");
        Dog dog = new Dog("jack");
        Cat cat = new Cat("kont");    
        Features cat1 = new Cat("name");
        
        duck.Food();
        dog.Food();
        cat.Food();
        cat1.Voice();

        duck.GetFeetNumber();//2
        dog.GetFeetNumber();//4
        cat.GetFeetNumber();//4
        
        duck.GetName();//karacaoglan
        dog.GetName();//jack
        cat.GetName();//kont
        
        duck.Voice();
        dog.Voice();
        cat.Voice();
    }
}
