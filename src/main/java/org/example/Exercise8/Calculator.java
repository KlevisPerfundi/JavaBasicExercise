package org.example.Exercise8;

public class Calculator {
    private int a;
    private int b;
    private int c;

    private int x;

    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int subtrack(int a,int b,int c){
       return a-b-c;
    }
    public int multiply(int a,int b,int c){
        return a*b*c;
    }

    public double divide(int a,int b,int c){
        return a/b/c;
    }

    public boolean isPositive(int a) {
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isNegative(int a){
            if (a<0){
                return true;
            }else {
                return false;
            }
    }

    public boolean isOdd(int a){
        if (a%2!=0){
            return true;
        }else
            return false;
    }
    public int min(int a,int b,int c){
        if (a<b && a<c){
            return a;
        }else if(b<a && b<c){
            return b;
        }else {
            return c;
        }
    }
    public int max(int a,int b,int c){
        if (a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else
            return c;
    }
    public double average(int a,int b,int c){
        return  (a+b+c)/2;
    }

    public int power(int a,int x){
        for (int i=1;i<x;i++){
            a*=a;
        }
        return a;
    }

}
