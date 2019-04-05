package com.yrova.app.employee.duties;

import com.yrova.app.animals.Animal;

public class AnimalTask implements Task {

    private Animal animal;
    private String zone;
    private String summaryOfTask;
    private int priority;
    private String date;

    public AnimalTask(Animal animal, String zone, String summaryOfTask, int priority, String date){

        this.animal = animal;
        this.zone = zone;
        this.summaryOfTask = summaryOfTask;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getSummaryOfTask() {
        return summaryOfTask;
    }

    public void setSummaryOfTask(String summaryOfTask) {
        this.summaryOfTask = summaryOfTask;
    }

    public void displayTask(){
        System.out.print(this.summaryOfTask);
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    public void setDate(String date){
        this.date = date;
    }


    public void display() {
        System.out.print(this.getSummaryOfTask() + " ");
    }
}