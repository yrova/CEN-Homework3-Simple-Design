package com.yrova.app;

import com.yrova.app.animals.Animal;
import com.yrova.app.animals.AnimalRegister;
import com.yrova.app.employee.Cashier;
import com.yrova.app.employee.EmployeeRegister;
import com.yrova.app.employee.ZooKeeper;
import com.yrova.app.employee.duties.AnimalTask;
import com.yrova.app.employee.duties.OtherTask;
import com.yrova.app.ui.TextUserInterface;

import java.util.Scanner;

public class AppApplication {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        //Create registers to hold employee/animal objects created by the user
        AnimalRegister animalRegister = new AnimalRegister();
        EmployeeRegister employeeRegister = new EmployeeRegister();

        //Start user interface
        TextUserInterface ui = new TextUserInterface(reader, employeeRegister, animalRegister);
        ui.start();
/*
        //Instantiating all of the objects for testing
        final ZooKeeper zooKeeper1 = new ZooKeeper("Danny", "Devito", "12323", "321 Ocean Lane", 8453);
        final ZooKeeper zooKeeper2 = new ZooKeeper("Sigourney", "Weaver", "2343", "3 Ave", 34234);

        final Cashier cashier1 = new Cashier("Keanu", "Reeves", "2234234", "234 Meadow lane", 7343);
        final Cashier cashier2 = new Cashier("Coco", "Chanel", "767676", "88 Lane Drive", 3432);

        final Animal lion = new Animal("Lion", "male/white", true, false);
        final Animal tiger = new Animal("Tiger", "orange/black", true, false);

        AnimalTask task1 = new AnimalTask(lion, "zone1", "Clean Cage", 3, "12/23/19");
        AnimalTask task2 = new AnimalTask(tiger, "zone3", "Feed", 1, "12/25/18");
        OtherTask task3 = new OtherTask("Restock Drinks");
        OtherTask task4 = new OtherTask("Order more supplies");

        //Assigns tasks to an employee
        zooKeeper2.addTask(task2);
        cashier1.addTask(task3);
        cashier2.addTask(task4);


        //add employees to register
        EmployeeRegister employeeRegister = new EmployeeRegister() {
            {
                addEmployee(zooKeeper1);
                addEmployee(zooKeeper2);
                addEmployee(cashier1);
                addEmployee(cashier2);
            }
        };

        //add animals to register
        AnimalRegister animalRegister = new AnimalRegister() {
            {
                addAnimal(lion);
                addAnimal(tiger);
            }
        };

        //print all employee/animal info
        employeeRegister.printAllEmployees();
        animalRegister.printAllAnimalsWithInfo();
        */
    }

}