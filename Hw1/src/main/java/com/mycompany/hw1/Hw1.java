package com.mycompany.hw1;

public class Hw1 {

    public static void main(String[] args) {
        
        Animal a1 = new Animal("DOG", AnimalTypes.MAMAL);
        Animal a2 = new Animal("LIZARD", AnimalTypes.REPTILE);
        Animal a3 = new Animal("PARROT", AnimalTypes.BIRD);
        Animal a4 = new Animal("ANCHOVY", AnimalTypes.FISH);
        
        Animal[] animals = {a1, a2, a3, a4};
        
        Zoo MyZoo = new Zoo(animals);
        
        MyZoo.PrintAnimals();
       
    }
}
