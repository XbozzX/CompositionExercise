package com.learnProgramming;

public class Lamp {

    //declare the field
    private String style;
    private boolean battery;
    private int globRating;

    //Create the constructor for init the field
    public Lamp(String style, boolean battery, int globRating){
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }


    //Create the method for indicate the lamp is turn on
    public void turnOn(){
        System.out.println("Lamp turning on");
    }

    //Create the getter
    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
