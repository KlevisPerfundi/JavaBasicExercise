package org.example.Exercise9;

import java.util.Arrays;

public class Stack {
    private int count;

    private int i;

    private  int size;

    private int[] vlera;

    private int index;

    public int getCount() {
        return count;
    }

    public Stack(int count) {
        this.count = count;
        vlera = new int[count];
        this.index = index;
    }


    public void push(Integer e, int index) {
        vlera[index] = e;

        }



    public Integer pop(int index) {
      return   vlera[index] = 0;
    }


    public boolean isEmpty(){
        if(size==0){
            return true;
        }else
            return false;
    }

    public boolean isFull(){
        if (size==count){
            return true;
        }else
            return false;
    }



        @Override
        public String toString () {
            return Arrays.toString(vlera);
        }
    }


