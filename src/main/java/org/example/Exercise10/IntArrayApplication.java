package org.example.Exercise10;

public class IntArrayApplication {
    public static void main(String[] args) {
        int item=3;
        int idx=4;
        IntArray intArray = new IntArray();
        intArray.add(3,1);
        intArray.add(3,2);
        intArray.add(3,3);
        intArray.add(1,0);
        intArray.add(0,4);

        System.out.println(intArray.toString());
    }
}
