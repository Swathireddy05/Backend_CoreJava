package com.java.Threads;

public class NumThread extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Numbers from 1 to 10:" +i);
        }
    }
    public static void main(String[] args){
        NumThread t1=new NumThread();
        t1.start();
    }
}
