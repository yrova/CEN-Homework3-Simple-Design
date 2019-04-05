package com.yrova.app.animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalRegister {

    List<Animal> animalRegister = new ArrayList<Animal>();

    public void addAnimal(Animal animal){
        animalRegister.add(animal);
    }

    public void deleteAnimal(Animal animal){
        animalRegister.remove(animal);
    }

    public void printAllAnimals(){
        for(Animal x:this.animalRegister){
            System.out.println(x.getSpecies());
        }
    }

    public void printAllAnimalsWithInfo(){
        for(Animal x:this.animalRegister){
            x.printAnimalInfo();
            System.out.println();
        }
    }
}