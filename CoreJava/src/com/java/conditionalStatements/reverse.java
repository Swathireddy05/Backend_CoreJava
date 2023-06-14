package com.java.conditionalStatements;

public class reverse {
    public static void main(String[] args){
        int num=12345;
        int reverse=0;
        while(num!=0){
            int x=num%10;
            reverse=reverse*10+x;
            num=num/10;
        }
        System.out.println("The reverse of a number 12345 is:" +reverse);
    }
}
