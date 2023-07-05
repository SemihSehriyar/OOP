package com.mycompany.hw1;

enum AnimalTypes{
    MAMAL(),
    BIRD(),
    REPTILE(),
    FISH();
}

public class Animal {
    private String name;
    private AnimalTypes type;
    
    public Animal(String name, AnimalTypes type){
        this.name = name;
        this.type = type;
    }
    
    public String toString(){
        return name;
    }
}