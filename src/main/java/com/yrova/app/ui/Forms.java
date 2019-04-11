package com.yrova.app.ui;

import com.yrova.app.animals.Animal;
import com.yrova.app.animals.AnimalRegister;
import com.yrova.app.employee.EmployeeRegister;

import java.util.Scanner;

//TODO: Change class setup, using an overloaded constructor for this is bad design
public class Forms {

    private Scanner reader;
    private AnimalRegister animalRegister;
    private EmployeeRegister employeeRegister;

    public Forms(Scanner reader, EmployeeRegister employeeRegister) {
        this.reader = reader;
        this.employeeRegister = employeeRegister;
    }

    public Forms(Scanner reader, AnimalRegister animalRegister) {
        this.reader = reader;
        this.animalRegister = animalRegister;
    }

    public void addAnimal(){

        Boolean dangerous = null;
        Boolean fed = null;

        //clear line for input
        reader.nextLine();

        System.out.println("\nWelcome to the Animal Add From. Please enter the information!\n");
        System.out.println("What species is the creature?: ");
        String species = reader.nextLine().toLowerCase();
        System.out.println("Description: ");
        String summary = reader.nextLine();

        while(true){
            System.out.println("Is the animal dangerous? Y/N");
            String input = reader.nextLine().toUpperCase();
            if(input.equals("Y")){
                dangerous = true;
                break;
            } else if(input.equals("N")){
                dangerous = false;
                break;
            } else {
                System.out.println("Not valid input, Try again!");
            }
        }

        while(true){
            System.out.println("Is the animal fed? Y/N");
            String input = reader.nextLine().toUpperCase();
            if(input.equals("Y")){
                fed = true;
                break;
            } else if(input.equals("N")){
                fed = false;
                break;
            } else {
                System.out.println("Not valid input, Try again!");
            }
        }

        //Create animal object and add it animalRegister
        Animal animal = new Animal(species,summary,dangerous,fed);
        animalRegister.addAnimal(species, animal);
        System.out.print("Animal Successfully added!\n");
        System.out.flush();
    }


}
