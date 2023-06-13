package com.java.Exceptions;

public class CustomException extends ArithmeticException{

    public  CustomException(){}

    public  CustomException(String errorMessage){
        super(errorMessage);
    }

    public void divideByZero(){
        int i=0;
        try {
            int x = 25 / i;
            System.out.println("value of  x" + x);

        }catch(ArithmeticException e)
        {
            System.out.println(e);
            throw new CustomException("ArithmeticException class");
        }

    }

    public static void main(String args[]) throws Exception {

        CustomException c=new CustomException();
        try{
            c.divideByZero();
        }
        catch(CustomException e){
            throw new CustomException("CustomException");
        }
    }

}

