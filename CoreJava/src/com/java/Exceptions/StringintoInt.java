package com.java.Exceptions;

public class StringintoInt {
    public static void StringintoInt(String str){
        try{
            int i=Integer.parseInt(str);
            System.out.println(i);
            System.out.println("Inside try Block");
        }
        catch(Exception e){
            System.out.println("Inside the catch");
        }

    }
    public static void main(String[] args){
        String str="23";
        //StringintoInt("45.67");
    }
}
