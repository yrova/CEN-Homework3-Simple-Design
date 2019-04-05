package com.yrova.app.employee.duties;

public class OtherTask implements Task {

    private String summary;
    private int priority;
    private String date;

    public OtherTask(String summary, int priority, String date) {
        this.summary = summary;
        this.priority = priority;
        this.date = date;
    }

    public OtherTask(String summary){
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    public void setDate(String date){
        this.date = date;
    }


    public void display(){
        System.out.print(this.getSummary() + " ");
    }
}