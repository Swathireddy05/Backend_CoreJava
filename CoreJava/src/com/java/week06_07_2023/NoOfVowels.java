package com.java.week06_07_2023;

import java.util.Scanner;

public class NoOfVowels {
    public static void main(String[] args){
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        name=name.toLowerCase();
        int count=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'
            ||name.charAt(i)=='o'||name.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("total no of Vowels:"+count);
    }
}
