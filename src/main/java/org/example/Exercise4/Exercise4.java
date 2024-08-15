package org.example.Exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        Reducer reducer = new Reducer();
        String numberToReduce="12455";
        long reducedValue= reducer.reduce(numberToReduce);
        System.out.println("Number to reduce: "+numberToReduce);
        System.out.println("After reduce: "+reducedValue);
    }
}
