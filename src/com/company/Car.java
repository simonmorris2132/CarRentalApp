package com.company;

public class Car {

    private final String name;
    private final String color;
    private final int price;
    private boolean isRented;


    public Car(String name, String color, int price, boolean isRented) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.isRented = isRented;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getDetails(){
        return name;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}