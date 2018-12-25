package com.company;

public class Box implements Comparable<Box> {

    private int length;
    private int width;
    private int boxNum;

    //Constructor
    public Box(int boxNum, int length, int width) {
        this.length = length;
        this.width = width;
        this.boxNum = boxNum;
    }

    //Returns the width
    public int getWidth(){
        return width;
    }

    //Returns the length
    public int getLength(){
        return length;
    }

    //Compares two Box objects
    @Override
    public int compareTo(Box o) {
        int perimeter = 2 * length + 2 * width;
        int perimeterOther = 2 * o.length + 2 * o.width;
        return perimeter - perimeterOther;
    }

    //toString() method to print Rectangle objects to the console
    public String toString() {
        return String.format("Box: %d \nLength: %d Width: %d \n", boxNum, length, width);
    }
}