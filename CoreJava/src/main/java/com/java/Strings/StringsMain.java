package com.java.Strings;

import java.util.Scanner;

public class StringsMain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //Checking for anagram
        Anagram a=new Anagram();
        String name1=sc.next();
        String name2=sc.next();
        System.out.println("Is Anagram " + a.FindAnagram(name1,name2));

        //reversing words in a string
        reverse sr=new reverse();
        sr.stringRev("Java J2EE Reverse Me");

        //isrotation or not
        rotation ss=new rotation();
        System.out.println("Is rotation "+ss.isRotation("JavaJ2eeStrutsHibernate","StrutsHibernateJavaJ2ee"));
    }
}
