package com.yrova.app.areas;

import com.yrova.app.animals.Animal;
import com.yrova.app.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Zone {

    private String description;
    private int numberOfAnimals;
    private int numberOfEmployeess;
    private boolean open;
    private List<Animal> animalsInZone = new ArrayList<Animal>();
    private List<Employee> employeesInZone = new ArrayList<Employee>();

    public Zone(String description, int numberOfAnimals, boolean open) {
        this.description = description;
        this.numberOfAnimals = numberOfAnimals;
        this.open = false;
    }

    public void open(){
        this.open=true;
    }

    public void close(){
        this.open = false;
    }

    public void addAnimal(Animal animal){
        this.animalsInZone.add(animal);
        this.numberOfAnimals++;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void setNumberOfAnimals(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }

    public int getNumberOfEmployeess() {
        return numberOfEmployeess;
    }

    public void setNumberOfEmployeess(int numberOfEmployeess) {
        this.numberOfEmployeess = numberOfEmployeess;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }


    public void removeAnimal(Animal animal){
        this.animalsInZone.remove(animal);
        this.numberOfAnimals--;
    }

    public void assignEmployee(Employee employee){
        this.employeesInZone.add(employee);
    }

    public void deleteEmployee(Employee employee){
        this.employeesInZone.remove(employee);
    }

    public void zoneInformation(){
        System.out.printf(
                "Description: %s\n" +
                        "Number of Animals in Zone: %d\n" +
                        "Open to Public: %b",
                this.getDescription(), this.getNumberOfAnimals(),this.isOpen(),this.getNumberOfEmployeess());
    }


}