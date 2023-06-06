package com.java.week05_31_2023;

import java.util.Scanner;

public class week05_Main {
    public static void main(String[] args) {

        //Department size
        subdepartment size = new subdepartment();
        System.out.println(size.departmentsize);

        //Product details
        Product x = new Product();
        Scanner a = new Scanner(System.in);
        double quantity=a.nextDouble();
        System.out.println(x.getPrice(quantity));

        x.setPrice(250.3);
        System.out.println(x.getPrice());
        System.out.println(x.getPrice(quantity));

        //Runtime Polymorphism
        poly y= new poly();
        y.shape();
    }
}