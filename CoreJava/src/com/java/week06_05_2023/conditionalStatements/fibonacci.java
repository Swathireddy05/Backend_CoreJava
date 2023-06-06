package com.java.week06_05_2023.conditionalStatements;

public class fibonacci {
    public static void fibonacci(int N){
        int n1=0,n2=1;
        int count=0;
        while(count<N){
            System.out.println(n1);
            int n3=n2+n1;
            n1=n2;
            n2=n3;
            count=count+1;
        }
    }
    public static void main(String [] args){
        int N=10;
        fibonacci(N);
    }
}
