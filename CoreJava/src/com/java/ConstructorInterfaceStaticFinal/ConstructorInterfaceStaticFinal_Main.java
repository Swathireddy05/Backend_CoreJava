package com.java.ConstructorInterfaceStaticFinal;


import com.java.ConstructorInterfaceStaticFinal.Final.Vehicle;
import com.java.ConstructorInterfaceStaticFinal.Interface.Animal;
import com.java.ConstructorInterfaceStaticFinal.Static.Student;
import com.java.ConstructorInterfaceStaticFinal.constructor.child;

public class ConstructorInterfaceStaticFinal_Main {
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
