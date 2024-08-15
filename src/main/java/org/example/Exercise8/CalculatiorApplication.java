package org.example.Exercise8;

public class CalculatiorApplication {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Power: "+cal.power(2,4));
        System.out.println("Max: "+cal.max(4,2,6));
        System.out.println("Sum: "+cal.add(3,5,3));
        System.out.println("Divide: "+cal.divide(10,2,5));
        System.out.println("Average: "+cal.average(3,3,5));
        System.out.println("Negative: "+cal.isNegative(-3));
        System.out.println("Multiply: "+cal.multiply(3,4,2));
        System.out.println("Is odd: "+cal.isOdd(5));
        System.out.println("Residue: "+cal.subtrack(4,2,3));

    }

}
