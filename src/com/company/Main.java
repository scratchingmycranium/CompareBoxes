package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Program Dialogue
        System.out.println("Welcome, This is the Random Box Generator!");
        System.out.println();
        System.out.println("This program will calculate which randomly generated box " +
                "has the largest perimeter.");
        System.out.println();

        System.out.println("Please input the number of boxes you would like " +
                "to generate:");
        System.out.println("(Note that choosing a number > 2147483639" +
                " may generate an error)");
        //User defined box count
        int numBoxes = sc.nextInt();

        System.out.println();

        //Creates an array with the given user input
        Box[] boxes = new Box[numBoxes];

        //Creates boxes with a length & width between 0 - 99
        if(boxes.length > 0) {
            for (int i = 0; i < boxes.length; i++) {
                int length = (int) (Math.random() * 100);
                int width = (int) (Math.random() * 100);
                boxes[i] = new Box(i+1, length, width);

            }

            for(Box box: boxes) {
                System.out.println(box.toString());
            }

            System.out.println();
            System.out.println("*************************");
            System.out.println("The largest box is:");
            System.out.print(FindLargest.find(boxes));
            System.out.println("*************************");

        } else{
            System.out.println("Sorry, you did not specify how many boxes you want to create!");
        }


    }
}
