package com.yrova.app.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRegister {

    List<Employee> employeeRegister = new ArrayList<Employee>();

    public void addEmployee(Employee employee){
        employeeRegister.add(employee);
    }

    public void deleteEmployee(Employee employee){
        employeeRegister.remove(employee);
    }

    public void printAllEmployees(){
        for(Employee x:this.employeeRegister){
            x.printEmployeeInfo();
            System.out.println();
        }

        if(this.employeeRegister.isEmpty()){
            System.out.println("No Employees added");
        }
    }
}