package com.java.ConstructorInterfaceStaticFinal.constructor;

public class child extends parent{
    public int height;

    public child() {
        height=35;
        super.age=20;
    }
    public child(int age, int h) {
        super.age=age;
        this.height=h;
    }

}

