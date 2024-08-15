package org.example.Exercise7;

public class CarApplication {
    public static void main(String[] args) {

        Car audi = new Car();
        audi.setColor("Blue");
        audi.setModel("A8");
        audi.setProductYear(2014);


        System.out.println(audi.getModel());
        System.out.println(audi.getColor());
        System.out.println(audi.getProductYear());
        System.out.println(audi.drive(200));
        System.out.println(audi.isUsed());


    }
}
