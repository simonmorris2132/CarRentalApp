package com.company;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Car> carsAval = new ArrayList<>();

    private ArrayList<Car> rentedCars = new ArrayList<>();

    public void initializeCars(){
        Car car1 = new Car("Hyundai", "Elantra", "Black", 250, false);
        carsAval.add(car1);

        Car car2 = new Car("Ford", "Mustang", "Red", 400, false);
        carsAval.add(car2);

        Car car3 = new Car("Honda", "Accord", "Charcoal Grey", 400, false);
        carsAval.add(car3);

        Car car4 = new Car("Chevy", "Volt", "Yellow", 500, false);
        carsAval.add(car4);

        Car car5 = new Car("VW", "Beatle", "Blue", 275, false);
        carsAval.add(car5);
    }

    public ArrayList<Car> getCarsAval() {
        return carsAval;
    }

    public ArrayList<Car> getRentedCars() {
        return rentedCars;
    }
}