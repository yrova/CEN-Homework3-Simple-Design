package com.yrova.app.employee;

import com.yrova.app.employee.duties.Task;

import java.util.LinkedList;
import java.util.Queue;

//TODO: Change queue to something else
public class Cashier extends Employee {

    private double salary;
    private Queue<Task> taskList = new LinkedList<Task>();

    public Cashier(String firstName, String lastName, String ssn, String address, double salary) {
        super(firstName, lastName, ssn, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addTask(Task task) {
        this.taskList.add(task);
    }

    public void taskfinished(){
        this.taskList.poll();
    }

    public void processTransaction(){
        System.out.println("Transaction Processed");
    }

    public void printTaskList() {

        if(!this.taskList.isEmpty()){
            for (Task t : this.taskList) {
                t.display();
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