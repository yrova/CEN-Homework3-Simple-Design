package com.yrova.app.ui;

import com.yrova.app.animals.AnimalRegister;
import com.yrova.app.employee.EmployeeRegister;


import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private EmployeeRegister employeeRegister;
    private AnimalRegister animalRegister;

    public TextUserInterface(Scanner reader , EmployeeRegister employeeRegister, AnimalRegister animalRegister){
        this.reader = reader;
        this.employeeRegister = employeeRegister;
        this.animalRegister = animalRegister;
    }

    //Main menu of program, should only be accessible by authenticated users(not implemented)
    public void start(){

        while(true) {

            System.out.println("Zoo Control Panel" + "\n-----------------");
            System.out.println("Choose Operation:\n"+
                    "[1] Animals\n" +
                    "[2] Employees\n" +
                    "[0] EXIT\n");

            int input = reader.nextInt();

            switch (input) {
                case 0:
                    return;
                case 1:
                    animals();
                    break;
                case 2:
                    employee();
                    break;
                default:
                    System.out.println("Not a valid input. Please try again\n");
            }
        }
    }

    public void animals() {

        while (true) {

            System.out.println("\nChoose Operation\n" +
                    "[1] View All Animals\n" +
                    "[2] View All Animals and Info\n" +
                    "[3] Add Animal\n" +
                    "[4] Delete Animal\n" +
                    "[0] BACK\n");

            int input = reader.nextInt();

            switch (input) {
                case 0:
                    start();
                    break;
                case 1:
                    animalRegister.printAllAnimals();
                    break;
                case 2:
                    animalRegister.printAllAnimalsWithInfo();
                    break;
                case 3:
                    Forms animalAdd = new Forms(reader, animalRegister);
                    animalAdd.addAnimal();
                    break;
                case 4:
                    reader.nextLine();
                    System.out.println("Please enter the species you want to delete: ");
                    String speciesName = reader.nextLine().toLowerCase();
                    animalRegister.deleteAnimal(speciesName);
                    break;
                default:
                    System.out.println("Not a valid input. Please try again!");
            }
        }
    }

    //TODO: Add Cashier and ZooKeeper functionality
    public void employee(){

        while(true){

            System.out.println("\nChoose Operation\n"+
                    "[1] Cashier\n" +
                    "[2] ZooKeeper\n" +
                    "[3] View All Employees\n" +
                    "[0] BACK\n");

            int input = reader.nextInt();

            switch(input){
                case 0:
                    start();
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("All Employees\n-------------\n");
                    employeeRegister.printAllEmployees();
                    break;
                default:
                    System.out.println("Not a valid input. Please try again!");
                    break;
            }
        }
    }
}

