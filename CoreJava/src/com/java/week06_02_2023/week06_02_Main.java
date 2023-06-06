package com.java.week06_02_2023;


import com.java.week06_02_2023.Final.Vehicle;
import com.java.week06_02_2023.Interface.Animal;
import com.java.week06_02_2023.Static.Student;
import com.java.week06_02_2023.constructor.child;

public class week06_02_Main {
    public static void main(String[] args) {

        System.out.println("Hello world!!!!");
        Animal a=new Animal();
        a.Dog();
        a.Cat();

        child c=new child();
        child c1=new child(23,56);
        System.out.println(c.age);
        System.out.println(c1.age);
        System.out.println(c.height);

        System.out.println(Student.id);
        System.out.println("Student id:" +Student.getId());

        Vehicle v=new Vehicle();
        System.out.println(v.Bike(2));

    }

}
