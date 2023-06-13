package com.java.Exceptions;

public class StringintoInt {
    public static void StringintoInt(String str){
        try{
            int i=Integer.parseInt(str);
            System.out.println(i);
        }

        catch(Exception e){
            System.out.println("This is Exception");
        }
    }
    public static void main(String[] args) {
        StringintoInt("23");
        StringintoInt("45.67");
        StringintoInt("test");
        StringintoInt("123f");
    }
}
