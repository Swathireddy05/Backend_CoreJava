package com.java.Arrays;

public class rotationArray {
    public static void rotationArray(){
    System.out.println("Rotating 2 positions  to left : ");
    System.out.println("Before Rotation");
    int n=2;
    int temp=0,i=0;
    int a[];
    a=new int[]{1,2,3,4,5,6,7};
        for(int k=0;k< a.length;k++)
            System.out.print(a[k]+" ");
        System.out.println("");
        while(i<n){
        for(int j=0;j< a.length-1;j++){
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
        }
        i++;
    }
        System.out.println("After Rotation");
        for(int k=0;k< a.length;k++)
            System.out.print(a[k]+" ");
        System.out.println("");
    }
    public static void main(String[] args){
        rotationArray();
    }
}
