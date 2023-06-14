package com.java.conditionalStatements;

public class fizzBuzz {
    public void checkNum(int N){
        for(int i=1;i<=N;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        int N=100;
        fizzBuzz num=new fizzBuzz();
        num.checkNum(N);
    }
}
