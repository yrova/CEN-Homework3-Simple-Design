package com.yrova.app.employee;

import com.yrova.app.animals.Animal;
import com.yrova.app.employee.duties.Task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZooKeeper extends Employee {

    private double salary;
    private String privlages;
    private Queue<Task> taskList = new LinkedList<Task>();
    private List<Animal> assignedAnimals = new ArrayList<Animal>();

    public ZooKeeper(String firstName, String lastName, String ssn, String address, int salary){
        super(firstName, lastName, ssn, address);
        this.salary = salary;
    }

    public String getPrivlages() {
        return privlages;
    }

    public void setPrivlages(String privlages) {
        this.privlages = privlages;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Queue<Task> getTaskList() {
        return taskList;
    }

    public void addTask(Task task) {
        this.taskList.add(task);
    }

    public void taskfinished(){
        this.taskList.poll();

    }

    public void printTaskList(){
        if(!this.taskList.isEmpty()){
            for (Task t : this.taskList) {
                t.display();
            }
        } else {
            System.out.print("No tasks assigned");
        }
    }

    public void printAssignedAnimals(ArrayList<Animal> assignedAnimals){
        if(!this.assignedAnimals.isEmpty()) {
            for (Animal a : this.assignedAnimals) {
                a.printAnimalInfo();
            }
            return;
        }

        System.out.print("No tasks assigned");
    }

    @Override
    public void printEmployeeInfo() {
        super.printEmployeeInfo();
        System.out.println("Salary: $" + this.salary);
        System.out.print("Task: ");
        this.printTaskList();
        System.out.println();
    }
}