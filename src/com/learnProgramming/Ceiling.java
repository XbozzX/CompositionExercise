package com.learnProgramming;

public class Ceiling {

    //Declare the field
    private int height;
    private int paintedColor;

    //Create the constructor for init field
    public Ceiling(int height, int paintedColor){
        this.height = height;
        this.paintedColor = paintedColor;
    }

    //Create the getter method

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
