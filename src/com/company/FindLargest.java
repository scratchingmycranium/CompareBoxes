package com.company;

public class FindLargest<E> {

    public static <E extends Comparable<E>> E find(E[] array){
        //Stores the largest object
        E largest = array[0];

        //Loops through the Array and finds the largest object
        for(E items: array){
            if(items.compareTo(largest) > 0){
                largest = items;
            }
        }
        return largest;
    }

}
