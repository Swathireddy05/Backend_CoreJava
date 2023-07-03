package com.java.Oops;

public class Product {
    private double price=200.98;
    public double getPrice(){
        return price;
    }
    public double getPrice(double quantity){
        return price*quantity;
    }
    public void setPrice(double newPrice){
        this.price=newPrice;
    }

}
