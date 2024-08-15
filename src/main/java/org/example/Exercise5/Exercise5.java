package org.example.Exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");
        String tx = sc.next();
        int sum =0;
        int win;

        String visi ="";


        char[] tx1 = tx.toCharArray();
        tx1[0]=Character.toUpperCase(tx1[0]);
        for (int i=0;i<tx.length();i++){

            if(tx1[i]==' '){
                tx1[i]='\b';
                tx1[i+1]=Character.toUpperCase(tx1[i+1]);
                sum+=1;
            }
            }

            System.out.println("Text the same way you have writed:\n " + tx + " \nNumbers of character: " + tx1.length);
            System.out.println("Text without space and with Upper case: ");
            System.out.println(tx1);
            System.out.println("Numbers of character: " + (tx1.length - 1));

        if (tx1.length-1>160) {
            win = (tx1.length - 1) / 160 * 25;
            System.out.println("You have win " + win +" cents");
        }else
        {
            System.out.println("You have won 0 money");
        }

        }
        }


