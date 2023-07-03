package com.java.Arrays;

public class reverseArray {
    static int array[] = {1, 2, 3, 65, 34, 23, 43, 87, 1, 32, 2, 76};

    static void reverse() {
        System.out.println("Reversed Array");
        int newArr[] = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            newArr[j] = array[i];

        }
        for (int i = 0; i < newArr.length; i++)
            System.out.print(newArr[i] + " ");
        System.out.println("\n");
    }
    public static void main(String[] args){
        reverse();
    }
}
