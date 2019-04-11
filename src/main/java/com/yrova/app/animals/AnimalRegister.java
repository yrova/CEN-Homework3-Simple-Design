package com.yrova.app.animals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalRegister {

    Map<String,Animal> animalRegister = new HashMap<String, Animal>();

    //TODO: Check to see if the animal already exists before adding
    public void addAnimal(String species, Animal animal){
        animalRegister.put(species,animal);
    }

    public void deleteAnimal(String species){

        if(!animalRegister.containsKey(species)){
            System.out.println("This animal does not exist!");
        }

        animalRegister.remove(species);
    }

    public void printAllAnimals(){
        if(this.animalRegister.isEmpty()){
            System.out.println("No animals entered");
            return;
        }

        System.out.println("Animals: \n");

        for(String species : animalRegister.keySet()){
            System.out.println(species);
        }
    }

    public void printAllAnimalsWithInfo(){

        if(this.animalRegister.isEmpty()){
            System.out.println("No animals entered");
            return;
        }

        System.out.println("Animals with info: \n");

        for(Animal animal: animalRegister.values()){
            animal.printAnimalInfo();
            System.out.println();
        }
    }
}