package org.example.Exercise6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("New Id Cart number: ");
        IdCard id = new IdCard();


        System.out.print("Year YY:");

        String yY = sc.next();
        if (yY.length() > 2) {
            System.out.println("Write year with 2 digits");
            yY = sc.next();
        }

        System.out.println("Month MM");
        String mM = sc.next();
        if (mM.length() > 2) {
            System.out.println("Write month with 2 digits");
            mM = sc.next();
        }
        System.out.println("Day DD");
        String dD = sc.next();
        if (dD.length() > 2) {
            System.out.println("Write day with 2 digits");
            dD = sc.next();
        }
        System.out.println("Ordinal number XXXX");
        String xXXX = sc.next();
        if (xXXX.length() > 4 && xXXX.length() < 4) {
            System.out.println("Write ordinal number  with 4 digits");
            xXXX = sc.next();
        }
        System.out.println("Control number");
        String c = sc.next();
        if (c.length() > 1) {
            System.out.println("Write control number  with 1 digits");
            xXXX = sc.next();
        }

        String result = yY + mM + dD + xXXX + c;

        char[] visi = result.toCharArray();

        IdCard.validation(visi);

        System.out.println(id.correction(result,visi));

        ;
    }
}

