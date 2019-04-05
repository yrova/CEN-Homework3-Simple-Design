package com.yrova.app.animals;

import com.yrova.app.employee.Employee;
import com.yrova.app.employee.ZooKeeper;

public class Animal {

    private String species;
    private String summary;
    private Boolean isDangerous;
    private Boolean fed;
    private Employee assignedKeeper = null;

    public Animal(String species, String summary, Boolean isDangerous, Boolean fed) {
        this.species = species;
        this.summary = summary;
        this.isDangerous = isDangerous;
        this.fed = fed;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Boolean getDangerous() {
        return isDangerous;
    }

    public void setDangerous(Boolean dangerous) {
        isDangerous = dangerous;
    }

    public Boolean getFed() {
        return fed;
    }

    public void setFed(Boolean fed) {
        this.fed = fed;
    }

    public void assignKeeper(ZooKeeper zooKeeper){
        this.assignedKeeper = zooKeeper;
    }

    public void printAnimalInfo(){
        System.out.println(
                "Species: " + this.species +
                        "\nSummary: " + this.summary +
                        "\nDangerous: " + this.isDangerous +
                        "\nFed: " + this.fed
        );
    }
}
