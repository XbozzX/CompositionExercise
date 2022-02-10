package com.learnProgramming;

public class Bed {

    //declare the field
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    //Create the constructor for init the field
    public Bed(String style,int pillows, int height, int sheets, int quilt){
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    //Create a method to indicate for making bed
    public void make(){
        System.out.println("Making the bed");
    }

    //Create the getter method
    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
