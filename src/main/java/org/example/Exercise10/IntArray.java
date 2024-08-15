package org.example.Exercise10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IntArray {
    private int size;
    private Integer value3;
    private int value2;
    private int[] line;
    private int[] line1;

    public IntArray() {
        line = new int[value2];
    }

    public void add(Integer value3) {
        value2++;
        if (size == line.length) {
            line1 = new int[(size + 1) * 2];
            for (int i = 0; i < line.length; i++)
                line1[i] = line[i];
            line = line1;
        }
        line[size] = value3;
        size++;
    }

    public void add(Integer value1, int idx) {
        if (idx >= line.length) {
            line1 = new int[(idx + 1) * 2];
            for (int i = 0; i < line.length; i++)
                line1[i] = line[i];
            line = line1;
        }
        line[idx] = value1;
    }

    public Integer get(int idx){

        return line[size];
    }

    public void remove(int idx){
        line[idx]=0;
    }

    public  void  swap(int from,int to){
    }
    public String toString(){
        return Arrays.toString(line) +"";
    }
}
