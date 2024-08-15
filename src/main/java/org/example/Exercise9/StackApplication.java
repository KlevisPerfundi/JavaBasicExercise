package org.example.Exercise9;

public class StackApplication {
    public static void main(String[] args) {
        Stack stack= new Stack(3);
        stack.push(3,1);
        stack.push(5,2);
        stack.push(4,0);
        System.out.println(stack.isFull());

    }
}
