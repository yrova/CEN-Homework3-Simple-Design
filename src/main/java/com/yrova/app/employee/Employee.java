package com.yrova.app.employee;

public abstract class Employee {

    private String firstName;
    private String lastName;
    private String ssn;
    private String address;

    public Employee(String firstName, String lastName, String ssn,String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSSN() {
        return ssn;
    }

    public void setSocialSecuirtyNumber(String ssn) {
        this.ssn = ssn;
    }

    public void printEmployeeInfo(){
        System.out.println("" +
                "First Name: " + this.firstName +
                "\nLast Name: " + this.lastName +
                "\nSSN: " + this.ssn +
                "\nAddress: " + this.address);
    }
}