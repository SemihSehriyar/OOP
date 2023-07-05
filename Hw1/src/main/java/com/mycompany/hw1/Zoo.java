package com.mycompany.hw1;

public class Zoo {
    public Animal[] animals;
    
    public Zoo(Animal[] animals){
        this.animals = animals;
    }
    
    void PrintAnimals(){
        for(Animal animal : animals){
            System.out.println(animal.toString());
        }
    }
}
