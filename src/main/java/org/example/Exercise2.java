package org.example;

public class Exercise2 {
    public static void main(String[] args) {


    String p="+";
    String h="-";
    String v="|";


    int[] line=new int[7];

    line[1]=1;
    line[3]=2;
    line[5]=3;


    int sum =2 ;

    for (int i=0;i< line.length;i++){
        if ((i+1)%2!=0){
            System.out.println(p+h+h+h+p+h+h+h+p+h+h+h+p);

        }else {

            System.out.println(v+" "+line[i]+" "+ v+" "+line[i]*2+" "+v+" "+line[i]*3+" "+v);
        }
    }

    }
}
