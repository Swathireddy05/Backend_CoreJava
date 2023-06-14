package com.java.Threads;

public class NumRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Numbers From 1 to10 :" + i);
        }
    }
    public static void main(String[] args) {
        NumRunnable n2=new NumRunnable();
        Thread t=new Thread(n2);
        t.start();

    }
}