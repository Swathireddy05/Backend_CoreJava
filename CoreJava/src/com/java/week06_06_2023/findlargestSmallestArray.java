package com.java.week06_06_2023;

public class findlargestSmallestArray {
    //declaring an array
    //int array[];

    static int array[]={1,2,3,65,34,23,43,87,1,32,2,76};
    static int largest(){
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    static int smallest(){
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        //display the array
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("largest number in the array" +largest());
        System.out.println("smallest number in the array" +smallest());
    }



}
