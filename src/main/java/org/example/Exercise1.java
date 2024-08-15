package org.example;

public class Exercise1 {
    public static void main(String[] args) {

        int[] vlera =new int[10];

             for (int i=0;i<vlera.length;i++){
                 for(int j=0;j< vlera.length;j++){
                     vlera[j]=(i+1)*(j+1);
                     System.out.print( String.format("%4s",vlera[j]));
                 }
                 System.out.println();
             }
    }
}