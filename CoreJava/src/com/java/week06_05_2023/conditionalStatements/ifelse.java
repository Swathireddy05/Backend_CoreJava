package com.java.week06_05_2023.conditionalStatements;

public class ifelse {
    public static int findAgeCategory(int age) {
        if (age < 13) {
            System.out.println("The person is kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("The person is teen");
        } else {
            System.out.println("The person is adult");
        }
        return age;
    }
}
