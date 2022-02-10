package com.learnProgramming;

public class Bedroom {

    //Declare the field
    private String name;
    private Wall wall1;
    private  Wall wall2;
    private Wall wall3;
    private  Wall wall4;
    private Ceiling ceiling;
    private  Bed bed;
    private Lamp lamp;

    //Create the constructor for init the field
    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    //Create the getter method
    public Lamp getLamp(){
        return lamp;
    }

    //Create method makeBed
    public void makeBed(){
        bed.make();
    }
}
